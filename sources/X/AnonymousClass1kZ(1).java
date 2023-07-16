package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.common.ui.text.CustomTypefaceSpan;

/* renamed from: X.1kZ  reason: invalid class name */
public final class AnonymousClass1kZ extends AnonymousClass1lO {
    public final C23481dv A00;

    public final Class modelClass() {
        return AnonymousClass1lA.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        int i;
        AnonymousClass1lA r10 = (AnonymousClass1lA) mfV;
        AnonymousClass129 r11 = (AnonymousClass129) m5o;
        AnonymousClass0wJ.A1N(r10, r11);
        Context A0B = C18240wQ.A0B(r11);
        String A0g = C18190wL.A0g(A0B.getResources(), 2131821848);
        TextView textView = r11.A00;
        Integer num = r10.A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        Typeface A03 = C09250f7.A05.A00(A0B).A03(C09340fG.A0k);
        if (A03 == null) {
            A03 = Typeface.DEFAULT_BOLD;
        }
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(A03);
        SpannableStringBuilder append = spannableStringBuilder.append(A0g).append(" ");
        switch (num.intValue()) {
            case 0:
                i = 2131836334;
                break;
            case 1:
                i = 2131836333;
                break;
            default:
                i = 2131836332;
                break;
        }
        append.append(A0B.getString(i)).setSpan(customTypefaceSpan, length, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    public AnonymousClass1kZ(C23481dv r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.follow_list_sorting_entry_row, viewGroup, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater));
        AnonymousClass0wJ.A16(inflate, HttpStatus.SC_METHOD_FAILURE, this);
        return new AnonymousClass129(inflate);
    }
}
