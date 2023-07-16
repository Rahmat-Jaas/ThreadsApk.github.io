package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import X.L60;
import X.L61;
import com.facebook.pando.TreeJNI;

public final class TestObjectDefaultArgumentsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class TestObject extends TreeJNI implements C81204nM {

        public final class TestObjectList extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return L61.A1L();
            }
        }

        public final class TestObjectTestObject extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return L61.A1L();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(TestObjectTestObject.class, "test_object(object_value:$object_value)", false), C18190wL.A0G(TestObjectList.class, "test_object_list(objects_value:$objects_value)", true)};
        }

        public final String[] getScalarFields() {
            return L60.A1b("test_enum(enum_value:$enum_value)", "test_enum_list(enums_value:$enums_value)");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(TestObject.class, "test_object");
    }
}
