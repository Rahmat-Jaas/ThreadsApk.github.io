package com.instagram.ui.widget.nametag;

import X.AnonymousClass0wJ;
import X.C09250f7;
import X.C09340fG;
import X.C18190wL;
import X.C86134wK;
import X.C86154wM;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Locale;

public class UsernameTextView extends TextView {
    public String A00;
    public Drawable A01;
    public String A02;

    public static void A01(UsernameTextView usernameTextView, String str, String[] strArr, int i, int i2) {
        String str2;
        int lastIndexOf;
        if (i != 0) {
            String str3 = str;
            if (!TextUtils.isEmpty(str3)) {
                UsernameTextView usernameTextView2 = usernameTextView;
                int i3 = i2;
                StaticLayout staticLayout = new StaticLayout(str3, usernameTextView2.getPaint(), i3, Layout.Alignment.ALIGN_CENTER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, false);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                for (int i4 = 0; i4 < staticLayout.getLineCount(); i4++) {
                    A0v.add(str3.substring(staticLayout.getLineStart(i4), staticLayout.getLineEnd(i4)));
                }
                String[] strArr2 = strArr;
                if (A0v.size() == 1) {
                    strArr[strArr2.length - i] = str3;
                    return;
                }
                String A0p = C18190wL.A0p(A0v, 0);
                int length = A0p.length();
                int max = Math.max(A0p.lastIndexOf(95), A0p.lastIndexOf(46));
                if (max > 0) {
                    int i5 = max;
                    while (true) {
                        char charAt = A0p.charAt(i5);
                        if (charAt != '_' && charAt != '.') {
                            length = max + 1;
                            break;
                        }
                        i5--;
                        if (i5 < 0) {
                            break;
                        }
                    }
                } else if (!TextUtils.isEmpty(usernameTextView2.A02) && (lastIndexOf = A0p.lastIndexOf(str2)) >= 0) {
                    length = C86154wM.A06((str2 = usernameTextView2.A02), lastIndexOf);
                } else if (A0v.size() == 2) {
                    length = Math.round(C86134wK.A01(str3.length()));
                }
                strArr[strArr2.length - i] = str3.substring(0, length);
                A01(usernameTextView2, str3.substring(length), strArr2, i - 1, i3);
            }
        }
    }

    public void setName(String str, String str2) {
        this.A00 = str;
        if (!TextUtils.isEmpty(str2)) {
            String trim = str2.trim();
            int indexOf = trim.indexOf(32);
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            this.A02 = trim;
            this.A02 = trim.toUpperCase(Locale.US);
        }
    }

    public UsernameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Context context = getContext();
        this.A01 = context.getDrawable(R.drawable.nametag_card_glyph);
        setTextSize(0, (float) context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
        setTypeface(C09250f7.A05.A00(context).A03(C09340fG.A0M));
        setAllCaps(true);
        setIncludeFontPadding(false);
        setGravity(17);
        setLetterSpacing(0.03f);
    }

    public UsernameTextView(Context context) {
        super(context);
        A00();
    }

    public UsernameTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
