package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3400000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.mediakit.model.MediaKitInsightType;
import com.instagram.mediakit.model.MediaKitSectionType;
import com.instagram.mediakit.model.MediaKitVisibility;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.6TD  reason: invalid class name */
public final class AnonymousClass6TD {
    public static final Map A00(C109436k0 r18) {
        String str;
        Long l;
        String str2;
        ArrayList arrayList;
        String str3;
        ArrayList arrayList2;
        C109436k0 r10 = r18;
        if (r18 == null) {
            return null;
        }
        C89865Hh r5 = r10.A00;
        List<BKU> list = r5.A06;
        ArrayList A0x = AnonymousClass0wJ.A0x(list, 10);
        for (BKU A33 : list) {
            String A332 = A33.A33();
            C04220Ms.A06(A332);
            A0x.add(AnonymousClass0wJ.A0d(A332));
        }
        String str4 = r5.A02;
        if (str4 == null || (str = AnonymousClass8bP.A0M(str4).toString()) == null) {
            str = "";
        }
        String str5 = r5.A03;
        if (str5 != null) {
            l = AnonymousClass0wJ.A0d(str5);
        } else {
            l = null;
        }
        long parseLong = Long.parseLong(r5.A01.getId());
        String obj = AnonymousClass8bP.A0M(r5.A05).toString();
        MediaKitVisibility mediaKitVisibility = r5.A00;
        C04220Ms.A0B(obj, 5);
        StringWriter A0d = C18230wP.A0d();
        MIS mis = C18987Aon.A00;
        MMp A04 = mis.A04(A0d);
        A04.A0J();
        Iterator A0t = C18190wL.A0t(A04, C18170wI.A00(347), A0x);
        while (A0t.hasNext()) {
            C86134wK.A1K(A04, A0t);
        }
        A04.A0F();
        A04.A0d(DevServerEntity.COLUMN_DESCRIPTION, str);
        if (l != null) {
            A04.A0c("id", l.longValue());
        }
        A04.A0c("owner_id", parseLong);
        A04.A0d(DialogModule.KEY_TITLE, obj);
        A04.A0d("visibility", mediaKitVisibility.A00);
        A04.A0G();
        A04.close();
        Pair A0p = C18180wK.A0p("summary", C18190wL.A0n(A0d));
        List<KtCSuperShape0S3400000_I2> list2 = r10.A02;
        try {
            StringWriter A0d2 = C18230wP.A0d();
            MMp A042 = mis.A04(A0d2);
            A042.A0I();
            for (KtCSuperShape0S3400000_I2 ktCSuperShape0S3400000_I2 : list2) {
                Iterable iterable = (Iterable) ktCSuperShape0S3400000_I2.A00;
                KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2 = null;
                if (iterable != null) {
                    arrayList = AnonymousClass0wJ.A0x(iterable, 10);
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AnonymousClass0wJ.A0d(C18220wO.A0c(it).getId()));
                    }
                } else {
                    arrayList = null;
                }
                String str6 = ktCSuperShape0S3400000_I2.A04;
                if (str6 != null) {
                    str3 = AnonymousClass8bP.A0M(str6).toString();
                } else {
                    str3 = null;
                }
                long parseLong2 = Long.parseLong(ktCSuperShape0S3400000_I2.A05);
                Long valueOf = Long.valueOf(parseLong2);
                Iterable<KtCSuperShape0S1100000_I2> iterable2 = (Iterable) ktCSuperShape0S3400000_I2.A01;
                if (iterable2 != null) {
                    arrayList2 = AnonymousClass0wJ.A0x(iterable2, 10);
                    for (KtCSuperShape0S1100000_I2 ktCSuperShape0S1100000_I2 : iterable2) {
                        arrayList2.add(ktCSuperShape0S1100000_I2.A00);
                    }
                } else {
                    arrayList2 = null;
                }
                KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I22 = (KtCSuperShape0S0110000_I2) ktCSuperShape0S3400000_I2.A02;
                if (ktCSuperShape0S0110000_I22 != null) {
                    boolean z = ktCSuperShape0S0110000_I22.A01;
                    Iterable<KtCSuperShape1S0200000_I2_1> iterable3 = (Iterable) ktCSuperShape0S0110000_I22.A00;
                    ArrayList A0x2 = AnonymousClass0wJ.A0x(iterable3, 10);
                    for (KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1 : iterable3) {
                        String A333 = ((BKU) ktCSuperShape1S0200000_I2_1.A01).A33();
                        C04220Ms.A06(A333);
                        A0x2.add(AnonymousClass0wJ.A0d(A333));
                    }
                    ktCSuperShape0S0110000_I2 = new KtCSuperShape0S0110000_I2(z, (List) A0x2, 16);
                }
                String obj2 = AnonymousClass8bP.A0M(ktCSuperShape0S3400000_I2.A06).toString();
                MediaKitSectionType mediaKitSectionType = (MediaKitSectionType) ktCSuperShape0S3400000_I2.A03;
                C86104wH.A1P(obj2, 6, mediaKitSectionType);
                A042.A0J();
                if (arrayList != null) {
                    Iterator A0t2 = C18190wL.A0t(A042, "accounts", arrayList);
                    while (A0t2.hasNext()) {
                        C86134wK.A1K(A042, A0t2);
                    }
                    A042.A0F();
                }
                if (str3 != null) {
                    A042.A0d(DevServerEntity.COLUMN_DESCRIPTION, str3);
                }
                if (valueOf != null) {
                    A042.A0c("id", parseLong2);
                }
                if (arrayList2 != null) {
                    Iterator A0t3 = C18190wL.A0t(A042, "insights", arrayList2);
                    while (A0t3.hasNext()) {
                        MediaKitInsightType mediaKitInsightType = (MediaKitInsightType) A0t3.next();
                        if (mediaKitInsightType != null) {
                            A042.A0Y(mediaKitInsightType.A00);
                        }
                    }
                    A042.A0F();
                }
                if (ktCSuperShape0S0110000_I2 != null) {
                    A042.A0U("media_posts");
                    A042.A0J();
                    A042.A0e("hides_likes", ktCSuperShape0S0110000_I2.A01);
                    List list3 = (List) ktCSuperShape0S0110000_I2.A00;
                    if (list3 != null) {
                        Iterator A0t4 = C18190wL.A0t(A042, "media_items", list3);
                        while (A0t4.hasNext()) {
                            C86134wK.A1K(A042, A0t4);
                        }
                        A042.A0F();
                    }
                    A042.A0G();
                }
                A042.A0d(DialogModule.KEY_TITLE, obj2);
                A042.A0d("type", mediaKitSectionType.A00);
                A042.A0G();
            }
            A042.A0F();
            A042.close();
            str2 = C18190wL.A0n(A0d2);
        } catch (IOException unused) {
            str2 = "";
        }
        return AnonymousClass4WJ.A0G(A0p, C18180wK.A0p("sections", str2));
    }
}
