package com.javarush.task.task33.task3309;

        import org.w3c.dom.Document;
        import org.w3c.dom.Node;
        import org.w3c.dom.NodeList;

        import javax.xml.bind.JAXBContext;
        import javax.xml.bind.JAXBException;
        import javax.xml.bind.Marshaller;
        import javax.xml.bind.annotation.XmlRootElement;
        import javax.xml.bind.annotation.XmlType;
        import javax.xml.parsers.DocumentBuilder;
        import javax.xml.parsers.DocumentBuilderFactory;
        import javax.xml.transform.OutputKeys;
        import javax.xml.transform.Transformer;
        import javax.xml.transform.TransformerFactory;
        import javax.xml.transform.dom.DOMSource;
        import javax.xml.transform.stream.StreamResult;
        import java.io.IOException;
        import java.io.StringWriter;

/*
Комментарий внутри xml
Реализовать метод toXmlWithComment, который должен возвращать строку — xml представление объекта obj.
В строке перед каждым тегом tagName должен быть вставлен комментарий comment.
Сериализация obj в xml может содержать CDATA с искомым тегом. Перед ним вставлять комментарий не нужно.
Пример вызова:
toXmlWithComment(firstSecondObject, «second», «it’s a comment»)
Пример результата:
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<first>
<!--it's a comment-->
<second>some string</second>
<!--it's a comment-->
<second>some string</second>
<!--it's a comment-->
<second><![CDATA[need CDATA because of < and >]]></second>
<!--it's a comment-->
<second/>
</first>
Требования:
1. Количество комментариев вставленных в xml должно быть равно количеству тегов tagName.
2. Метод toXmlWithComment должен возвращать xml в виде строки преобразованной в соответствии с условием задачи.
3. Метод toXmlWithComment не должен изменять входящий xml в случае, если искомый тег отсутствует в нём.
4. Метод toXmlWithComment должен быть статическим.
5. Метод toXmlWithComment должен быть публичным.
*/

//Временное решение, которое не принимается. И.. здесь нужен обход всего DOM, и работа с узлами документа...
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws IOException {
        StringWriter writer = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            //создаем дерево, состоящее из тэгов
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();
            document.setXmlStandalone(false);
            //делаем маршалинг в объект document
            marshaller.marshal(obj, document);
            //делаем CDATA, если нужно
            changeTextToCDATA(document, document);
            //добавляем комменты
            NodeList nodeList = document.getElementsByTagName(tagName);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node element = nodeList.item(i);
                element.getParentNode().insertBefore(document.createComment(comment), element);
            }
            /**
             * source - источник xml - дерева
             * result - поток, который запишет xml-дерево во writer
             */
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(writer);
            //записываем из source в result -> writer с помощью transformer
            //создаем трансформер, чтобы преобразовать дерево в результирующее дерево
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            //разршаем добавление доп. пробелов, чтобы было красиво, в виде иерархии
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
        }
        catch (Exception e){}
        finally {
            writer.close();
        }
        return writer.toString();
    }
    private static void changeTextToCDATA(Node mainNode, Document document){
        if (mainNode.hasChildNodes()){
            NodeList children = mainNode.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                Node node = children.item(i);
                if (node.getNodeType() == Node.TEXT_NODE){
                    if (node.getTextContent().matches(".*[<>&'\"].*")) {
                        Node newNode = document.createCDATASection(node.getTextContent());
                        node.getParentNode().replaceChild(newNode, node);
                    }
                }
                else
                    changeTextToCDATA(node, document);
            }
        }
    }


    public static void main(String[] args) {
//        String s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><first><second>some string</second><second>some string</second><second><![CDATA[need CDATA because of < and >]]></second><second/></first>";
//
//        String comment = "it's a comment";
//        String tagName = "second";
//
//        String res = null;
//        if (s.indexOf(tagName) > -1)
//            res = s.replace("<" + tagName + ">", "<!--" + comment + "-->" + "<" + tagName + ">");
//
//        System.out.println(res);
    }
}