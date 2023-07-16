package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import X.L61;
import com.facebook.pando.TreeJNI;

public final class TestObjectInlineArgumentsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class TestObject extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"test_boolean(bool_value:true)", "test_boolean_list(bools_value:[true,false,true])", "test_enum(enum_value:\"FIRST\")", "test_enum_list(enums_value:[\"FIRST\",\"SECOND\",\"THIRD\"])", "test_float(float_value:1.5)", "test_float_list(floats_value:[1.5,2.5,3.5])", "test_integer(int_value:1)", "test_integer_list(ints_value:[1,2,3])", "test_long(long_value:9007199254740992)", "test_long_list(longs_value:[-9007199254740993,-9007199254740992,9007199254740991,9007199254740992])", "test_string(string_value:\",./;'[]\\\\-=<>?:\\\"{}|_+!@#$%^&*()`~\")", "test_string(string_value:\"\\u0001\\u001f\\u0020\\u007f\\u0080\\ud7ff\\u8000\\uffff\\ud800\\udc00\\udbff\\udfff\")", "test_string(string_value:\"\\ud83d\\ude0d\\uD83D\\uDC95\")", "test_string(string_value:\"https://www.facebook.com/?param=foo#bar\")", "test_string(string_value:\"one\")", "test_string(string_value:\"κόσμε\")", "test_string_list(strings_value:[\"https://www.facebook.com/?param=foo#bar\",\"https://www.facebook.com/?param=foo#baz\"])", "test_string_list(strings_value:[\"one\",\"two\",\"three\"])"};
        }

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
            return C18180wK.A1a(C18190wL.A0G(TestObjectTestObject.class, "test_object(object_value:{\"boolean_field\":true,\"boolean_list_field\":[true,false,true],\"enum_field\":\"FIRST\",\"enum_list_field\":[\"FIRST\",\"SECOND\",\"THIRD\"],\"float_field\":5.5,\"float_list_field\":[5.5,10.5,15.5],\"integer_field\":5,\"integer_list_field\":[5,10,15],\"object_field\":{\"first\":\"one\",\"second\":\"two\"},\"object_list_field\":[{\"first\":\"one\",\"second\":\"two\"},{\"first\":\"three\",\"second\":\"four\"}],\"string_field\":\"first\",\"string_list_field\":[\"first\",\"second\",\"third\"]})", false), TestObjectList.class, "test_object_list(objects_value:[{\"boolean_field\":true,\"boolean_list_field\":[true,false,true],\"enum_field\":\"FIRST\",\"enum_list_field\":[\"FIRST\",\"SECOND\",\"THIRD\"],\"float_field\":5.5,\"float_list_field\":[5.5,10.5,15.5],\"integer_field\":5,\"integer_list_field\":[5,10,15],\"object_field\":{\"first\":\"one\",\"second\":\"two\"},\"object_list_field\":[{\"first\":\"one\",\"second\":\"two\"},{\"first\":\"three\",\"second\":\"four\"}],\"string_field\":\"first\",\"string_list_field\":[\"first\",\"second\",\"third\"]}])", true);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(TestObject.class, "test_object");
    }
}
