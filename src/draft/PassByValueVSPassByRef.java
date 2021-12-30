package draft;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.*;
import com.sun.xml.internal.txw2.Document;
import com.sun.xml.internal.txw2.TypedXmlWriter;

import javax.xml.namespace.QName;

public class PassByValueVSPassByRef {

    public static void main(String[] args) {

        int x = 50;
        change(x);
        System.out.println(x);
    }

    public static void change(int val) {
        val = val * 2;
    }

    Particle B = new Particle() {
        @Override
        public LocalElement element() {
            return null;
        }

        @Override
        public Any any() {
            return null;
        }

        @Override
        public ExplicitGroup all() {
            return null;
        }

        @Override
        public ExplicitGroup sequence() {
            return null;
        }

        @Override
        public ExplicitGroup choice() {
            return null;
        }

        @Override
        public Occurs minOccurs(int i) {
            return null;
        }

        @Override
        public Occurs maxOccurs(String s) {
            return null;
        }

        @Override
        public Occurs maxOccurs(int i) {
            return null;
        }

        @Override
        public void commit() {

        }

        @Override
        public void commit(boolean b) {

        }

        @Override
        public void block() {

        }

        @Override
        public Document getDocument() {
            return null;
        }

        @Override
        public void _attribute(String s, Object o) {

        }

        @Override
        public void _attribute(String s, String s1, Object o) {

        }

        @Override
        public void _attribute(QName qName, Object o) {

        }

        @Override
        public void _namespace(String s) {

        }

        @Override
        public void _namespace(String s, String s1) {

        }

        @Override
        public void _namespace(String s, boolean b) {

        }

        @Override
        public void _pcdata(Object o) {

        }

        @Override
        public void _cdata(Object o) {

        }

        @Override
        public void _comment(Object o) throws UnsupportedOperationException {

        }

        @Override
        public <T extends TypedXmlWriter> T _element(String s, Class<T> aClass) {
            return null;
        }

        @Override
        public <T extends TypedXmlWriter> T _element(String s, String s1, Class<T> aClass) {
            return null;
        }

        @Override
        public <T extends TypedXmlWriter> T _element(QName qName, Class<T> aClass) {
            return null;
        }

        @Override
        public <T extends TypedXmlWriter> T _element(Class<T> aClass) {
            return null;
        }

        @Override
        public <T extends TypedXmlWriter> T _cast(Class<T> aClass) {
            return null;
        }
    };
}
