package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import kotlin.jvm.internal.KtLambdaShape61S0100000_I2_41;

/* renamed from: X.1wF  reason: invalid class name */
public final class AnonymousClass1wF extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "EncryptedBackupsMoreOptionsFragment";
    public final C04530Oa A00 = C62373Zc.A03(new KtLambdaShape61S0100000_I2_41(this, 39));
    public final C04530Oa A01 = C62373Zc.A03(new KtLambdaShape61S0100000_I2_41(this, 40));
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63293hC r2 = new C63293hC(2131826791);
        r2.A00 = R.style.igds_emphasized_body_1;
        r2.A02 = R.dimen.account_permission_section_vertical_padding;
        A0v.add(r2);
        C63293hC r3 = new C63293hC(2131826785);
        r3.A00 = R.style.igds_body_1;
        A0v.add(r3);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass49L.A00(this.A00), 36320232025036628L)) {
            String A0k = AnonymousClass0wJ.A0k(requireContext(), 2131826790);
            String A0k2 = AnonymousClass0wJ.A0k(requireContext(), 2131826786);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Appendable append = spannableStringBuilder.append(A0k);
            C04220Ms.A06(append);
            C04220Ms.A06(append.append(10));
            spannableStringBuilder.append(A0k2);
            String A0n = C18190wL.A0n(spannableStringBuilder);
            String A0g = C18180wK.A0g(this, 2131826787);
            Integer valueOf = Integer.valueOf(R.drawable.instagram_app_icloud_pano_outline_24);
            A0v.add(new C57693Cc(C18190wL.A0H(this, 340), AnonymousClass24V.TYPE_CHEVRON, valueOf, A0g, A0n, 2802));
        }
        String A0g2 = C18180wK.A0g(this, 2131826789);
        String string = getString(2131826788);
        Integer valueOf2 = Integer.valueOf(R.drawable.instagram_more_horizontal_pano_outline_24);
        AnonymousClass24V r4 = AnonymousClass24V.TYPE_CHEVRON;
        A0v.add(new C57693Cc(C18190wL.A0H(this, 341), r4, valueOf2, A0g2, string, 2802));
        C63293hC r32 = new C63293hC(2131826784);
        r32.A00 = R.style.igds_emphasized_body_1;
        r32.A02 = R.dimen.account_permission_section_vertical_padding;
        A0v.add(r32);
        String A0g3 = C18180wK.A0g(this, 2131826783);
        String string2 = getString(2131826782);
        A0v.add(new C57693Cc(C18190wL.A0H(this, 339), r4, Integer.valueOf(R.drawable.instagram_download_pano_outline_24), A0g3, string2, 2802));
        setItems(A0v);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void configureActionBar(AnonymousClass4u2 r1) {
        AnonymousClass4u2.A05(r1);
    }
}
