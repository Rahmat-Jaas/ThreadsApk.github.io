package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6NX  reason: invalid class name */
public final class AnonymousClass6NX {
    public static final KtCSuperShape0S2000000_I2 A00(List list) {
        String str;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C146318m2) obj).AsC() == IgUserBioLinkTypeEnum.EXTERNAL) {
                break;
            }
        }
        C146318m2 r3 = (C146318m2) obj;
        if (r3 != null) {
            str = r3.getUrl();
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (r3 != null) {
            str2 = r3.BH2();
        }
        return new KtCSuperShape0S2000000_I2(str, str2, 16);
    }
}
