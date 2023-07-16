package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.2sp  reason: invalid class name and case insensitive filesystem */
public final class C50332sp {
    public static void A00(Context context, C61353Sw r11, AnonymousClass12X r12) {
        List list = r11.A03;
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2, 16.0f);
        RadioGroup radioGroup = r12.A00;
        radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        if (list != null && !list.isEmpty()) {
            String str = r11.A00;
            radioGroup.removeAllViews();
            for (int i = 0; i < list.size(); i++) {
                C62563aI r9 = (C62563aI) list.get(i);
                CompoundButton compoundButton = (CompoundButton) LayoutInflater.from(context).inflate(R.layout.row_selection_item, (ViewGroup) null);
                compoundButton.setText(r9.A02);
                compoundButton.setOnClickListener((View.OnClickListener) null);
                compoundButton.setLayoutParams(layoutParams);
                compoundButton.setId(i);
                if ((TextUtils.isEmpty(str) && i == 0) || (!TextUtils.isEmpty(str) && str.equals(C62563aI.A00(list, i)))) {
                    compoundButton.setChecked(true);
                }
                if (r11.A01) {
                    compoundButton.setAlpha(1.0f);
                } else {
                    compoundButton.setAlpha(0.3f);
                }
                compoundButton.setClickable(true);
                radioGroup.addView(compoundButton);
                if (!TextUtils.isEmpty(r9.A00)) {
                    TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.row_text, (ViewGroup) null);
                    C006702y.A08(textView);
                    textView.setMovementMethod(C28241F2t.A00);
                    textView.setText(r9.A00);
                    textView.setClickable(false);
                    textView.setLongClickable(false);
                    radioGroup.addView(textView);
                }
            }
        }
        radioGroup.setEnabled(r11.A01);
        radioGroup.setOnCheckedChangeListener(r11.A02);
    }
}
