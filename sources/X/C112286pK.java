package X;

import android.content.SharedPreferences;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100000_I2_1;
import com.instagram.service.session.UserSession;
import com.instagram.shopping.model.destination.home.ProductFeedHeader;
import com.instagram.shopping.model.destination.home.ProductSection;
import com.instagram.shopping.model.destination.home.ShoppingHomeFeedEndpoint;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110;

/* renamed from: X.6pK  reason: invalid class name and case insensitive filesystem */
public final class C112286pK {
    public final UserSession A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape130S0100000_I2_110(this, 27));

    public C112286pK(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(ShoppingHomeFeedEndpoint shoppingHomeFeedEndpoint, List list, boolean z, boolean z2) {
        KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2;
        ProductFeedHeader productFeedHeader;
        Integer num;
        C166919oS r0;
        Integer num2;
        C166919oS r02;
        ProductFeedHeader productFeedHeader2;
        ProductFeedHeader productFeedHeader3;
        C04530Oa r3 = this.A01;
        C19343Aul aul = (C19343Aul) r3.getValue();
        String A002 = C19343Aul.A00(shoppingHomeFeedEndpoint);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 = (KtCSuperShape0S1200000_I2) it.next();
            int ordinal = ((C170679vO) ktCSuperShape0S1200000_I2.A01).ordinal();
            boolean z4 = z2;
            if (ordinal != 1) {
                if (ordinal == 5) {
                    num = AnonymousClass006.A0C;
                } else if (ordinal == 7 || ordinal == 4) {
                    AnonymousClass5uG r11 = (AnonymousClass5uG) ktCSuperShape0S1200000_I2.A00;
                    ProductSection productSection = r11.A08;
                    if ((productSection == null || !productSection.A03) && ((r0 = r11.A05) == null || !r0.A02)) {
                        num2 = AnonymousClass006.A00;
                    } else {
                        num2 = AnonymousClass006.A01;
                    }
                    boolean z5 = z;
                    if ((productSection == null || (productFeedHeader3 = productSection.A01) == null || productFeedHeader3.A03 == null) && (((r02 = r11.A05) == null || (productFeedHeader2 = r02.A00) == null || productFeedHeader2.A03 == null) && !z)) {
                        z3 = false;
                    }
                    ktCSuperShape0S0130000_I2 = new KtCSuperShape0S0130000_I2(num2, z3, z5, z4);
                } else if (ordinal == 8) {
                    AnonymousClass65C r03 = ((AnonymousClass5uG) ktCSuperShape0S1200000_I2.A00).A0A;
                    if (r03 != null) {
                        ArrayList arrayList = r03.A02;
                        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((C89985Hw) it2.next()).A00.A02 == AnonymousClass006.A0C) {
                                        num = AnonymousClass006.A0N;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    num = AnonymousClass006.A0Y;
                }
                ktCSuperShape0S0130000_I2 = new KtCSuperShape0S0130000_I2(num, 14, false, false);
            } else {
                Integer num3 = AnonymousClass006.A0j;
                C166929oT r04 = ((AnonymousClass5uG) ktCSuperShape0S1200000_I2.A00).A02;
                if (r04 == null || (productFeedHeader = r04.A02) == null || productFeedHeader.A03 == null) {
                    z3 = false;
                }
                ktCSuperShape0S0130000_I2 = new KtCSuperShape0S0130000_I2(num3, 4, z3, z4);
            }
            A0v.add(ktCSuperShape0S0130000_I2);
        }
        if (C18190wL.A1a(A0v)) {
            aul.A00.put(A002, new KtCSuperShape1S0100000_I2_1(C18200wM.A0s(A0v)));
        } else {
            aul.A00.remove(A002);
        }
        UserSession userSession = this.A00;
        StringWriter A0d = C18230wP.A0d();
        MMp A0K = C18180wK.A0K(A0d);
        A0K.A0U("pages");
        A0K.A0J();
        Iterator A0u = C18190wL.A0u(((C19343Aul) r3.getValue()).A00);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            if (C86104wH.A0c(A0K, A0o) == null) {
                A0K.A0H();
            } else {
                KtCSuperShape1S0100000_I2_1 ktCSuperShape1S0100000_I2_1 = (KtCSuperShape1S0100000_I2_1) A0o.getValue();
                A0K.A0J();
                if (ktCSuperShape1S0100000_I2_1.A00 != null) {
                    A0K.A0U("sections");
                    A0K.A0I();
                    Iterator it3 = ((AbstractCollection) ktCSuperShape1S0100000_I2_1.A00).iterator();
                    while (it3.hasNext()) {
                        KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I22 = (KtCSuperShape0S0130000_I2) it3.next();
                        if (ktCSuperShape0S0130000_I22 != null) {
                            A0K.A0J();
                            Integer num4 = (Integer) ktCSuperShape0S0130000_I22.A00;
                            if (num4 != null) {
                                A0K.A0d("type", C102386Uz.A00(num4));
                            }
                            A0K.A0e("has_title", ktCSuperShape0S0130000_I22.A02);
                            A0K.A0e("has_button", ktCSuperShape0S0130000_I22.A01);
                            A0K.A0e("is_full_bleed", ktCSuperShape0S0130000_I22.A03);
                            A0K.A0G();
                        }
                    }
                    A0K.A0F();
                }
                A0K.A0G();
            }
        }
        A0K.A0G();
        String A0h = C18180wK.A0h(A0K, A0d);
        C63703i9 r32 = C63703i9.A00;
        SharedPreferences A003 = C63703i9.A00(r32, userSession);
        String A004 = AnonymousClass000.A00(1103);
        String A0h2 = C18200wM.A0h(A003, A004);
        if (A0h != null && !A0h.equals(A0h2)) {
            C18180wK.A0v(C63703i9.A00(r32, userSession).edit(), A004, A0h);
        }
    }
}
