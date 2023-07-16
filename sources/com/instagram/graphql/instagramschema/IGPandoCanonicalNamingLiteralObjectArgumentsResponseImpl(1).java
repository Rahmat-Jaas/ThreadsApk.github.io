package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGPandoCanonicalNamingLiteralObjectArgumentsResponseImpl extends TreeJNI implements C81204nM {

    public final class TestObject extends TreeJNI implements C81204nM {

        public final class TestObjectTestObject extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"boolean_field", "integer_field", "string_field"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(TestObjectTestObject.class, "test_object(object_value:{\"boolean_field\":$bool_value,\"boolean_list_field\":[true,false,true],\"enum_field\":\"FIRST\",\"enum_list_field\":[\"FIRST\",\"SECOND\",\"THIRD\"],\"float_field\":5.5,\"float_list_field\":[5.5,10.5,15.5],\"integer_field\":$int_value,\"integer_list_field\":[5,10,15],\"object_field\":{\"first\":\"one\",\"second\":\"two\"},\"object_list_field\":[{\"first\":\"one\",\"second\":\"two\"},{\"first\":\"three\",\"second\":\"four\"}],\"string_field\":$string_value,\"string_list_field\":[\"first\",\"second\",\"third\"]})");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(TestObject.class, "test_object");
    }
}
