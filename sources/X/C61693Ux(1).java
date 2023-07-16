package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.qrcode.AutosizingGradientTextView;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Ux  reason: invalid class name and case insensitive filesystem */
public final class C61693Ux {
    public View A00 = null;
    public AutosizingGradientTextView A01;
    public AutosizingGradientTextView A02;
    public C312424v A03;
    public final long A04;
    public final Context A05;
    public final Typeface A06;
    public final C11630kW A07;
    public final C13330nS A08;
    public final C28195F0u A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final int A0D;

    public C61693Ux(Context context, C11630kW r16, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        String str6 = str;
        this.A05 = context;
        C11630kW r1 = r16;
        this.A08 = C13330nS.A01(r1, userSession);
        this.A07 = r1;
        str2 = str2 == null ? "0" : str2;
        long j = 0;
        try {
            j = Long.parseLong(str2);
        } catch (NumberFormatException e) {
            AnonymousClass0LU.A0K("QRCodeDialogController", "failed to parse entity id: %s", e, str2);
        }
        this.A04 = j;
        this.A0C = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A03 = C312424v.A03;
        int round = Math.round(C09860go.A03(context, 200));
        this.A0D = round;
        Rect rect = new Rect(0, 0, round, round);
        this.A06 = C09250f7.A05.A00(this.A05).A03(C09340fG.A0N);
        try {
            Uri parse = Uri.parse(str6);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).fragment(parse.getFragment());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (!queryParameterNames.contains("utm_source")) {
                builder.appendQueryParameter("utm_source", "qr");
            }
            Iterator<String> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                if (!"igshid".equals(A0k)) {
                    builder.appendQueryParameter(A0k, parse.getQueryParameter(A0k));
                }
            }
            str6 = builder.build().toString();
        } catch (RuntimeException unused) {
            C10450iM.A03("QRCodeDialogParseError", AnonymousClass00U.A0L("failed url: ", str6));
        }
        Integer num = AnonymousClass006.A01;
        int i = this.A0D;
        int[] iArr = this.A03.A01;
        float f = (float) i;
        LinearGradient linearGradient = new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, iArr[0], iArr[1], Shader.TileMode.CLAMP);
        C28195F0u f0u = new C28195F0u();
        f0u.invalidateSelf();
        f0u.A01 = num;
        C28195F0u.A00(f0u);
        f0u.A06.setShader(linearGradient);
        f0u.invalidateSelf();
        f0u.setBounds(rect);
        f0u.A02 = str6;
        C28195F0u.A00(f0u);
        this.A09 = f0u;
    }

    public static void A00(View view, C312424v r10, C61693Ux r11) {
        r11.A03 = r10;
        for (C312424v r2 : C312424v.values()) {
            view.requireViewById(r2.A00).setSelected(C18180wK.A1Z(r2, r11.A03));
        }
        int[] iArr = r10.A01;
        C28195F0u f0u = r11.A09;
        float f = (float) r11.A0D;
        f0u.A06.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, iArr[0], iArr[1], Shader.TileMode.CLAMP));
        f0u.invalidateSelf();
        AutosizingGradientTextView autosizingGradientTextView = r11.A02;
        if (autosizingGradientTextView != null) {
            autosizingGradientTextView.setGradient(iArr);
        }
        AutosizingGradientTextView autosizingGradientTextView2 = r11.A01;
        if (autosizingGradientTextView2 != null) {
            autosizingGradientTextView2.setGradient(iArr);
        }
    }

    public final void A01() {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(this.A08, "ig_qr_code_impression"), 1412);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0S("entity_id", Long.valueOf(this.A04));
            A0I.A0T("source", this.A07.getModuleName());
            A0I.Bb4();
        }
        Context context = this.A05;
        Resources resources = context.getResources();
        C25828Dsm A0W = C18190wL.A0W(context);
        View A0E = C18240wQ.A0E(LayoutInflater.from(context), R.layout.qr_code_dialog_header_layout);
        this.A00 = A0E;
        C18220wO.A17(AnonymousClass0wJ.A0L(A0E, R.id.message), this.A0C, 0, 8);
        C18200wM.A0J(this.A00, R.id.qr_code).setImageDrawable(this.A09);
        for (C312424v r8 : C312424v.values()) {
            View view = this.A00;
            ImageView A0J = C18200wM.A0J(view, r8.A00);
            C86414xd r1 = new C86414xd(view.getContext());
            r1.A00 = r8.A01;
            r1.invalidateSelf();
            A0J.setImageDrawable(r1);
            C18200wM.A1E(A0J, this, view, r8, 66);
        }
        AutosizingGradientTextView autosizingGradientTextView = (AutosizingGradientTextView) this.A00.requireViewById(R.id.title);
        this.A02 = autosizingGradientTextView;
        String str = this.A0B;
        if (str != null) {
            int round = Math.round(C09860go.A03(context, 14));
            int round2 = Math.round(C09860go.A03(context, 40));
            autosizingGradientTextView.A01 = round;
            autosizingGradientTextView.A00 = round2;
            this.A02.setTypeface(this.A06);
            this.A02.setText(str);
            this.A02.setGradient(this.A03.A01);
            this.A02.setVisibility(0);
        } else {
            autosizingGradientTextView.setVisibility(8);
        }
        AutosizingGradientTextView autosizingGradientTextView2 = (AutosizingGradientTextView) this.A00.requireViewById(R.id.subtitle);
        this.A01 = autosizingGradientTextView2;
        String str2 = this.A0A;
        if (str2 != null) {
            int round3 = Math.round(C09860go.A03(context, 14));
            int round4 = Math.round(C09860go.A03(context, 20));
            autosizingGradientTextView2.A01 = round3;
            autosizingGradientTextView2.A00 = round4;
            this.A01.setTypeface(this.A06);
            this.A01.setText(str2);
            this.A01.setGradient(this.A03.A01);
            this.A01.setVisibility(0);
        } else {
            autosizingGradientTextView2.setVisibility(8);
        }
        A00(this.A00, C312424v.A03, this);
        View view2 = this.A00;
        ViewGroup viewGroup = A0W.A0C;
        viewGroup.setVisibility(0);
        viewGroup.addView(view2);
        C18180wK.A1O(A0W, this, 174, 2131833865);
        A0W.A0a(C18220wO.A0O(this, 175), resources.getString(2131826219));
        A0W.A0H();
        A0W.A0r(true);
        AnonymousClass0wJ.A1K(A0W);
    }
}
