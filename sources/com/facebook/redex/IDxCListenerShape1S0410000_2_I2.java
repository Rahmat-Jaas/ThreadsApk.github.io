package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0hA;
import X.AnonymousClass0wJ;
import X.AnonymousClass25l;
import X.AnonymousClass5x9;
import X.C04180Mo;
import X.C04220Ms;
import X.C11630kW;
import X.C14030oh;
import X.C145578kj;
import X.C148548rG;
import X.C18180wK;
import X.C18200wM;
import X.C25786Drz;
import X.C25828Dsm;
import X.C35086Ime;
import X.C35355ItJ;
import X.C35387Itt;
import X.C36421JUf;
import X.C86154wM;
import X.DDJ;
import X.I17;
import X.I6I;
import X.KK5;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

public class IDxCListenerShape1S0410000_2_I2 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public IDxCListenerShape1S0410000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.A05 = i;
        this.A00 = obj3;
        this.A04 = z;
        this.A03 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onClick(View view) {
        if (this.A05 != 0) {
            int A052 = C14030oh.A05(1338228381);
            AnonymousClass5x9 r4 = (AnonymousClass5x9) this.A03;
            KK5 kk5 = (KK5) r4.A0B.getValue();
            I6I i6i = r4.A04;
            if (i6i == null) {
                C04220Ms.A0E("viewModel");
                throw null;
            }
            C35387Itt itt = i6i.A02;
            C35355ItJ itJ = i6i.A01;
            Integer num = AnonymousClass006.A00;
            KK5.A03(kk5, itJ, itt, num, AnonymousClass006.A0Y, (Integer) null, (Integer) null, i6i.A04, (String) null, r4.A06, (Map) null, 480);
            I6I i6i2 = r4.A04;
            if (i6i2 == null) {
                C04220Ms.A0E("viewModel");
                throw null;
            }
            if (!this.A04) {
                num = AnonymousClass006.A01;
            }
            i6i2.A0C(num, ((C148548rG) this.A01).ASx(), (List) this.A02);
            C25786Drz A0Q = C18180wK.A0Q(r4.getActivity(), AnonymousClass0wJ.A0X(r4.A0C));
            DDJ.A00();
            boolean z = ((C04180Mo) this.A00).A00;
            C35086Ime ime = new C35086Ime();
            Bundle A06 = C18180wK.A06();
            A06.putBoolean(I17.A00(149), true);
            A06.putBoolean(I17.A00(148), z);
            ime.setArguments(A06);
            A0Q.A03 = ime;
            A0Q.A07 = AnonymousClass000.A00(107);
            A0Q.A05();
            C14030oh.A0C(1335855431, A052);
            return;
        }
        int A053 = C14030oh.A05(777057186);
        if (this.A04) {
            View view2 = (View) this.A00;
            Hashtag hashtag = (Hashtag) this.A03;
            C11630kW r11 = (C11630kW) this.A01;
            Object obj = this.A02;
            Context context = view2.getContext();
            SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0l(context, hashtag.A0C, 2131837227));
            C25828Dsm dsm = new C25828Dsm(context);
            Matcher matcher = AnonymousClass0hA.A00.matcher(A0E.toString());
            C04220Ms.A06(matcher);
            while (matcher.find()) {
                A0E.setSpan(new StyleSpan(1), matcher.start(1), matcher.end(1), 33);
            }
            dsm.A0p(A0E);
            dsm.A0T(new IDxCListenerShape21S0400000_2_I2(1, view2, obj, r11, hashtag), AnonymousClass25l.RED, 2131837223);
            dsm.A0O(C86154wM.A0N(view2, 57), 2131823054);
            ImageUrl imageUrl = hashtag.A00;
            if (imageUrl != null) {
                dsm.A0l(imageUrl, r11);
            }
            AnonymousClass0wJ.A1K(dsm);
        } else {
            C36421JUf jUf = new C36421JUf((Hashtag) this.A03);
            jUf.A07 = 1;
            Hashtag A002 = jUf.A00();
            C145578kj r0 = (C145578kj) this.A02;
            ((HashtagFollowButton) this.A00).A01((C11630kW) this.A01, r0, A002);
            r0.BpQ(A002);
        }
        C14030oh.A0C(858511348, A053);
    }
}
