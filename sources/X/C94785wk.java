package X;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2;
import java.util.ArrayDeque;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123;

/* renamed from: X.5wk  reason: invalid class name and case insensitive filesystem */
public final class C94785wk extends C34640IcN {
    public static final String __redex_internal_original_name = "DefaultNudgeFragment";
    public C110816mK A00;
    public final C04530Oa A01 = AnonymousClass3W9.A00(this);

    public final String getModuleName() {
        return "nudging";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        String str;
        String str2;
        String str3;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) AnonymousClass0wJ.A0I(view, R.id.learn_more_tv);
        KtLambdaShape143S0100000_I2_123 ktLambdaShape143S0100000_I2_123 = new KtLambdaShape143S0100000_I2_123(this, 27);
        getResources();
        Long l = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        spannableStringBuilder.append(getString(2131834886));
        AnonymousClass2C8.A00(spannableStringBuilder, getString(2131834887), "[[learn_more]]", arrayDeque, new Object[]{new IDxCSpanShape188S0100000_2_I2(ktLambdaShape143S0100000_I2_123, C18180wK.A00(this), 8)}, 33);
        C18180wK.A0z(textView);
        textView.setHighlightColor(requireContext().getColor(R.color.fds_transparent));
        textView.setText(new SpannableString(spannableStringBuilder));
        C86104wH.A1C(AnonymousClass0wJ.A0I(view, R.id.nudge_cta), 165, this);
        C110816mK r1 = this.A00;
        if (r1 != null) {
            BKU bku = r1.A02;
            BZI bzi = r1.A01;
            boolean z = r1.A04;
            C13330nS r2 = r1.A00;
            if (bzi == null) {
                num = AnonymousClass006.A01;
            } else {
                num = AnonymousClass006.A00;
            }
            Map A0I = AnonymousClass4WJ.A0I(C18180wK.A0p("is_launched_from_bottomsheet", String.valueOf(z)));
            USLEBaseShape0S0000000 A0L = USLEBaseShape0S0000000.A0L(r2);
            if (num.intValue() != 0) {
                str = "heated_thread_ig_led";
            } else {
                str = "comment_reply";
            }
            A0L.A0T("source_of_action", str);
            A0L.A1h(A0I);
            Long l2 = null;
            if (!(bzi == null || (str3 = bzi.A0e) == null)) {
                l = AnonymousClass0wJ.A0d(str3);
            }
            A0L.A0S("parent_comment_id", l);
            if (!(bzi == null || (str2 = bzi.A0f) == null)) {
                l2 = AnonymousClass0wJ.A0d(str2);
            }
            A0L.A0S("replied_to_comment_id", l2);
            A0L.A0T("media_id", bku.A0f.A4Y);
            C18190wL.A1I(A0L, "impression");
            A0L.Bb4();
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-347911257);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nudge_bottom_sheet, viewGroup, false);
        C14030oh.A09(1880015821, A02);
        return inflate;
    }
}
