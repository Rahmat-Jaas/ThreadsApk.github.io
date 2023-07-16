package com.instagram.business.instantexperiences.ui;

import X.AnonymousClass0wJ;
import X.C121507Gm;
import X.C142408eo;
import X.C15430rJ;
import X.C86154wM;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpHost;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class InstantExperiencesBrowserChrome extends LinearLayout {
    public Context A00;
    public FrameLayout A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public C142408eo A07;
    public C121507Gm A08;
    public UserSession A09;
    public Executor A0A;
    public final DialogInterface.OnClickListener A0B = C86154wM.A0N(this, 48);

    public InstantExperiencesBrowserChrome(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = context;
    }

    /* access modifiers changed from: private */
    public CharSequence[] getMenuOptions() {
        Uri A012;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        CharSequence[] charSequenceArr = new CharSequence[A0v.size()];
        Context context = getContext();
        C86154wM.A1A(context, A0v, 2131829122);
        C86154wM.A1A(context, A0v, 2131829118);
        if (!(this.A08.A0D.peek() == null || C121507Gm.A01(this) == null || (A012 = C15430rJ.A01(C121507Gm.A01(this))) == null || (!HttpHost.DEFAULT_SCHEME_NAME.equals(A012.getScheme()) && !"https".equals(A012.getScheme())))) {
            C86154wM.A1A(context, A0v, 2131829121);
        }
        C86154wM.A1A(context, A0v, 2131829117);
        return (CharSequence[]) A0v.toArray(charSequenceArr);
    }

    public void setInstantExperiencesBrowserChromeListener(C142408eo r1) {
        this.A07 = r1;
    }

    public InstantExperiencesBrowserChrome(Context context) {
        super(context);
    }
}
