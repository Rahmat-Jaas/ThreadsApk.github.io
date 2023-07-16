package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape122S0000000_1_I2;
import com.facebook.redex.IDxCListenerShape177S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape20S1100000_1_I2;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2T7  reason: invalid class name */
public final class AnonymousClass2T7 {
    public static void A00(Context context, C11630kW r8, C81644o8 r9, C84844tx r10) {
        String str;
        AnonymousClass3TA r1;
        ImmutableList<AnonymousClass3TA> copyOf;
        C28251tw r0;
        C28251tw r02;
        String str2;
        String str3;
        C28291u0 r92 = (C28291u0) r9;
        String str4 = r92.A09.A00;
        if (str4.equals("iig_dialog") || str4.equals("iig_large_social_context_dialog")) {
            C25828Dsm A0W = C18190wL.A0W(context);
            C28221tt r3 = r92.A08;
            C28251tw r03 = r3.A09;
            if (!(r03 == null || (str3 = r03.A00) == null)) {
                A0W.A02 = str3;
            }
            C28231tu r04 = r3.A03;
            if (!(r04 == null || (str2 = r04.A00) == null)) {
                if ("220449009777528".equals(r92.A0D)) {
                    String string = context.getString(2131825615);
                    A0W.A0Z(new IDxCListenerShape20S1100000_1_I2(string, (Object) context, 9), AnonymousClass00U.A0V(r3.A03.A00, " ", string), string);
                } else {
                    A0W.A0p(str2);
                }
            }
            C560135l r05 = r3.A08;
            if (r05 != null) {
                str = r05.A00;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                IgdsHeadline igdsHeadline = A0W.A0I;
                igdsHeadline.setSupportingText((CharSequence) str);
                igdsHeadline.setVisibility(0);
                A0W.A0H();
            }
            AnonymousClass3CQ r12 = r3.A01;
            if (!(r12 == null || (r02 = r12.A00) == null || TextUtils.isEmpty(r02.A00))) {
                String str5 = r12.A00.A00;
                A0W.A0Y(new IDxCListenerShape77S0200000_1_I2(49, (Object) r92, (Object) r10), AnonymousClass25l.BLUE_BOLD, str5, r12.A04);
            }
            AnonymousClass3CQ r13 = r3.A02;
            if (!(r13 == null || (r0 = r13.A00) == null || TextUtils.isEmpty(r0.A00))) {
                String str6 = r13.A00.A00;
                A0W.A0W(new IDxCListenerShape77S0200000_1_I2(50, (Object) r92, (Object) r10), AnonymousClass25l.DEFAULT, str6, r13.A04);
            }
            if (r3.A00 != null) {
                A0W.A0S(new IDxCListenerShape122S0000000_1_I2(1), AnonymousClass25l.DEFAULT, 2131831869);
            }
            List list = r3.A0C;
            if (!(list == null || (copyOf = ImmutableList.copyOf((Collection) list)) == null)) {
                ArrayList A0t = C18200wM.A0t(copyOf);
                for (AnonymousClass3TA r06 : copyOf) {
                    A0t.add(r06.A00);
                }
                if (!A0t.isEmpty()) {
                    A0W.A0I.setFacepile(A0t, r8.getModuleName());
                    A0W.A0M(new IDxCListenerShape177S0200000_1_I2(4, r10, r92));
                    AnonymousClass0wJ.A1K(A0W);
                    A0W.A0q(AnonymousClass0wJ.A1W(r3.A00));
                    r10.CEB(r92);
                }
            }
            if ((C34822La.A00(context) && (r1 = r3.A06) != null && !AnonymousClass3WG.A02(r1.A00)) || ((r1 = r3.A07) != null && !AnonymousClass3WG.A02(r1.A00))) {
                if ("220449009777528".equals(r92.A0D)) {
                    ImageUrl imageUrl = r1.A00;
                    IgdsHeadline igdsHeadline2 = A0W.A0I;
                    igdsHeadline2.setImageURL(imageUrl, r8);
                    igdsHeadline2.setVisibility(0);
                } else {
                    A0W.A0l(r1.A00, r8);
                }
            }
            A0W.A0M(new IDxCListenerShape177S0200000_1_I2(4, r10, r92));
            AnonymousClass0wJ.A1K(A0W);
            A0W.A0q(AnonymousClass0wJ.A1W(r3.A00));
            r10.CEB(r92);
        }
    }
}
