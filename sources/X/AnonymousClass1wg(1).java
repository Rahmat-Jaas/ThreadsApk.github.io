package X;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2002000_I2;
import com.instagram.barcelona.R;
import com.instagram.release.buildinfo.BuildInfoStore;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.KtLambdaShape99S0100000_I2_79;

/* renamed from: X.1wg  reason: invalid class name */
public final class AnonymousClass1wg extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "BuildInfoFragment";
    public BuildInfoStore A00;
    public final String A01 = "https://fburl.com/w6e3v6dq";
    public final String A02 = "https://fburl.com/mobile_builds/akmu1kq4";
    public final C04530Oa A03 = C80644m9.A00(this);
    public final C63273h9 A04 = new C63273h9();
    public final DateFormat A05 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    public final String getModuleName() {
        return "appversion";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String A0i;
        List A0n;
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        String obj = C10340iB.A00().toString();
        String A022 = C10380iF.A02(requireContext());
        C04220Ms.A06(A022);
        String A012 = C10380iF.A01(requireContext());
        C04220Ms.A06(A012);
        String valueOf = String.valueOf(C10380iF.A00());
        DateFormat dateFormat = this.A05;
        String A0i2 = C18240wQ.A0i(dateFormat, AnonymousClass0Jc.A00(requireContext()).A00);
        C63613hu r9 = new C63613hu(2131822740);
        AnonymousClass4MA A013 = AnonymousClass4MA.A01((View.OnClickListener) null, A0B(A022, 2131822754));
        AnonymousClass4MA A014 = AnonymousClass4MA.A01((View.OnClickListener) null, A0B(obj, 2131822743));
        AnonymousClass4MA A015 = AnonymousClass4MA.A01((View.OnClickListener) null, A0B(A012, 2131822739));
        AnonymousClass4MA A016 = AnonymousClass4MA.A01((View.OnClickListener) null, A0B(valueOf, 2131822741));
        C04220Ms.A06(A0i2);
        List A18 = C06750aI.A18(r9, A013, A014, A015, A016, AnonymousClass4MA.A01((View.OnClickListener) null, A0B(A0i2, 2131822744)));
        C04530Oa r10 = this.A03;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r10);
        AnonymousClass0TJ r8 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r8, A0U, 36321889882283088L)) {
            List A182 = C06750aI.A18(this.A04, new C63613hu(2131822750));
            BuildInfoStore buildInfoStore = this.A00;
            if (buildInfoStore == null) {
                C04220Ms.A0E("buildInfoStore");
                throw null;
            }
            KtCSuperShape0S2002000_I2 ktCSuperShape0S2002000_I2 = buildInfoStore.A01;
            if (ktCSuperShape0S2002000_I2.A00 == 0 || buildInfoStore.A00 < System.currentTimeMillis() - 3600000) {
                long j = buildInfoStore.A00;
                if (j == 0) {
                    A0i = "Never";
                } else {
                    A0i = C18240wQ.A0i(dateFormat, j);
                }
                C04220Ms.A09(A0i);
                A0n = C18180wK.A0n(AnonymousClass4MA.A01((View.OnClickListener) null, A0B(A0i, 2131822749)));
            } else {
                AnonymousClass4MA A017 = AnonymousClass4MA.A01((View.OnClickListener) null, A0B(ktCSuperShape0S2002000_I2.A03, 2131822754));
                AnonymousClass4MA A018 = AnonymousClass4MA.A01((View.OnClickListener) null, A0B(String.valueOf(ktCSuperShape0S2002000_I2.A00), 2131822741));
                String A0i3 = C18240wQ.A0i(dateFormat, C18220wO.A09(ktCSuperShape0S2002000_I2.A01));
                C04220Ms.A06(A0i3);
                A0n = C06750aI.A17(A017, A018, AnonymousClass4MA.A01((View.OnClickListener) null, A0B(A0i3, 2131822744)), AnonymousClass4MA.A00(C18200wM.A0R(this, ktCSuperShape0S2002000_I2, 169), 2131822746));
            }
            A182.addAll(A0n);
            A18.addAll(A182);
        }
        C63273h9 r5 = this.A04;
        A18.addAll(C06750aI.A17(r5, new C63613hu(2131822752), AnonymousClass4MA.A00(C18210wN.A0H(this, 79), 2131822753), AnonymousClass4MA.A00(C18210wN.A0H(this, 80), 2131822751)));
        if (C63803iN.A0E(r8, AnonymousClass0wJ.A0U(r10), 36326897814087466L)) {
            A18.addAll(C06750aI.A17(r5, new C63613hu(2131822745), AnonymousClass4MA.A00(C18210wN.A0H(this, 77), 2131822748), AnonymousClass4MA.A00(C18210wN.A0H(this, 78), 2131822747)));
        }
        setItems(A18);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A07(r2, 2131822742);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    private final Spannable A0B(String str, int i) {
        String A0k = AnonymousClass0wJ.A0k(requireContext(), i);
        String A0V = AnonymousClass00U.A0V(A0k, ": ", str);
        SpannableString spannableString = new SpannableString(A0V);
        spannableString.setSpan(new ForegroundColorSpan(requireContext().getColor(R.color.igds_secondary_text)), C18220wO.A08(A0k) + 2, C18220wO.A08(A0V), 34);
        return spannableString;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1505108093);
        super.onCreate(bundle);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A03);
        C04220Ms.A0B(A0U, 0);
        this.A00 = (BuildInfoStore) A0U.A01(BuildInfoStore.class, new KtLambdaShape99S0100000_I2_79(A0U, 49));
        C14030oh.A09(482788426, A022);
    }
}
