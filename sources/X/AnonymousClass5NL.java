package X;

import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5NL  reason: invalid class name */
public class AnonymousClass5NL extends TreeJNI {
    public final List A0D(AnonymousClass0YY r5, int i) {
        C04220Ms.A0B(r5, 1);
        Iterable<Object> iterable = (Iterable) getFieldByHashCode_UNTYPED(i);
        if (iterable == null) {
            return null;
        }
        ArrayList<Object> A0x = AnonymousClass0wJ.A0x(iterable, 10);
        for (Object A1O : iterable) {
            C18210wN.A1O(A1O, A0x);
        }
        ArrayList A0x2 = AnonymousClass0wJ.A0x(A0x, 10);
        for (Object invoke : A0x) {
            A0x2.add(r5.invoke(invoke));
        }
        return A0x2;
    }

    public static User A00(TreeJNI treeJNI, int i) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) treeJNI.getTreeValueByHashCode(i, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            return new User(immutablePandoUserDict);
        }
        return null;
    }

    public static User A01(TreeJNI treeJNI, C112176p7 r2, int i) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) treeJNI.getTreeValueByHashCode(i, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict == null) {
            return null;
        }
        return (User) r2.A00.CYY(r2, new User(immutablePandoUserDict));
    }

    public static User A02(C112176p7 r1, C21100Boo boo) {
        return (User) r1.A00.CYY(r1, boo);
    }

    public static String A03(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(3355);
    }

    public static String A04(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(3556653);
    }

    public static String A05(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(110371416);
    }

    public final ImageUrl A06(int i) {
        String stringValueByHashCode = getStringValueByHashCode(i);
        if (stringValueByHashCode != null) {
            return C18250wR.A0K(stringValueByHashCode);
        }
        return null;
    }

    public final Float A07(int i) {
        Double optionalDoubleValueByHashCode = getOptionalDoubleValueByHashCode(i);
        if (optionalDoubleValueByHashCode != null) {
            return Float.valueOf((float) optionalDoubleValueByHashCode.doubleValue());
        }
        return null;
    }

    public final Object A08(AnonymousClass0YY r2, int i) {
        String str;
        Object fieldByHashCode_UNTYPED = getFieldByHashCode_UNTYPED(i);
        if (fieldByHashCode_UNTYPED != null) {
            str = fieldByHashCode_UNTYPED.toString();
        } else {
            str = null;
        }
        return r2.invoke(str);
    }

    public final Object A09(AnonymousClass0YY r2, int i) {
        String obj;
        Object fieldByHashCode_UNTYPED = getFieldByHashCode_UNTYPED(i);
        if (fieldByHashCode_UNTYPED == null || (obj = fieldByHashCode_UNTYPED.toString()) == null) {
            return null;
        }
        return r2.invoke(obj);
    }

    public final String A0A(int i) {
        Object fieldByHashCode_UNTYPED = getFieldByHashCode_UNTYPED(i);
        if (fieldByHashCode_UNTYPED != null) {
            return fieldByHashCode_UNTYPED.toString();
        }
        return null;
    }

    public final String A0B(String str) {
        String obj;
        Object field_UNTYPED = getField_UNTYPED(str);
        if (field_UNTYPED == null || (obj = field_UNTYPED.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final List A0C(int i) {
        ImmutableList optionalDoubleListByHashCode = getOptionalDoubleListByHashCode(i);
        if (optionalDoubleListByHashCode == null) {
            return null;
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(optionalDoubleListByHashCode);
        Iterator it = optionalDoubleListByHashCode.iterator();
        while (it.hasNext()) {
            A0w.add(Float.valueOf((float) C86124wJ.A00(it.next())));
        }
        return A0w;
    }
}
