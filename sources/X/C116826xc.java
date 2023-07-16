package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.6xc  reason: invalid class name and case insensitive filesystem */
public final class C116826xc {
    public static Integer A00(String str) {
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return AnonymousClass006.A00;
        }
        if (str.equals("EDITABLE")) {
            return AnonymousClass006.A01;
        }
        if (str.equals("SELECTED")) {
            return AnonymousClass006.A0C;
        }
        if (str.equals("UNSELECTED")) {
            return AnonymousClass006.A0N;
        }
        if (str.equals("UNEDITABLE")) {
            return AnonymousClass006.A0Y;
        }
        throw C18190wL.A0a(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "EDITABLE";
            case 2:
                return "SELECTED";
            case 3:
                return "UNSELECTED";
            case 4:
                return "UNEDITABLE";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
