package com.facebook.redex;

import X.AnonymousClass3RA;
import X.AnonymousClass3Zs;
import X.C04220Ms;
import X.C18190wL;
import X.C18250wR;
import X.C22641Yw;
import X.C23121bx;
import X.C25918DvM;
import X.C28161tl;
import X.C63813iO;
import X.C65623tx;
import X.C84334sy;
import X.D2R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

public class IDxTCallbackShape564S0100000_1_I2 implements C84334sy {
    public Object A00;
    public final int A01;

    public IDxTCallbackShape564S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CPO(C25918DvM dvM) {
        boolean z;
        switch (this.A01) {
            case 1:
                C04220Ms.A0B(dvM, 0);
                C23121bx r3 = (C23121bx) this.A00;
                FragmentActivity activity = r3.getActivity();
                Object obj = null;
                if (activity != null) {
                    obj = activity.getSystemService("clipboard");
                }
                ClipboardManager clipboardManager = (ClipboardManager) obj;
                if (clipboardManager != null) {
                    TextView textView = r3.A02;
                    if (textView == null) {
                        C04220Ms.A0E("backupCodesTextView");
                        throw null;
                    }
                    C18250wR.A0n(clipboardManager, "Backup Codes", textView.getText());
                    C63813iO.A02(r3.getContext(), r3.getString(2131824414), (String) null, 0);
                    dvM.A06(true);
                    return;
                }
                return;
            case 2:
                C04220Ms.A0B(dvM, 0);
                C22641Yw r8 = (C22641Yw) this.A00;
                Context requireContext = r8.requireContext();
                ClipboardManager clipboardManager2 = (ClipboardManager) requireContext.getSystemService("clipboard");
                if (clipboardManager2 != null) {
                    ClipData primaryClip = clipboardManager2.getPrimaryClip();
                    z = true;
                    if (!(primaryClip == null || primaryClip.getItemCount() <= 0 || primaryClip.getItemAt(0) == null)) {
                        CharSequence text = primaryClip.getItemAt(0).getText();
                        if (text != null) {
                            int length = text.length();
                            ConfirmationCodeEditText confirmationCodeEditText = r8.A0A;
                            if (confirmationCodeEditText != null) {
                                if (length == confirmationCodeEditText.A03) {
                                    confirmationCodeEditText.setText(text, TextView.BufferType.EDITABLE);
                                    ConfirmationCodeEditText confirmationCodeEditText2 = r8.A0A;
                                    if (confirmationCodeEditText2 != null) {
                                        confirmationCodeEditText2.setSelection(text.length());
                                        break;
                                    }
                                }
                            }
                            C04220Ms.A0E("confirmationCodeEditText");
                            throw null;
                        }
                        C63813iO.A02(requireContext, r8.getString(2131837047), (String) null, 0);
                        break;
                    }
                } else {
                    return;
                }
            case 4:
                ConfirmationCodeEditText confirmationCodeEditText3 = (ConfirmationCodeEditText) ((IDxCListenerShape173S0200000_1_I2) this.A00).A00;
                Context context = confirmationCodeEditText3.getContext();
                ClipData primaryClip2 = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip2 != null && primaryClip2.getItemCount() > 0) {
                    CharSequence text2 = primaryClip2.getItemAt(0).getText();
                    if (text2.length() == confirmationCodeEditText3.A03) {
                        confirmationCodeEditText3.setText(text2);
                        confirmationCodeEditText3.setSelection(text2.length());
                    } else {
                        C63813iO.A01(context, context.getString(2131837047));
                    }
                }
                z = true;
                break;
            default:
                return;
        }
        dvM.A06(z);
    }

    public final void CPS(C25918DvM dvM) {
        SharedPreferences.Editor editor;
        SharedPreferences A012;
        switch (this.A01) {
            case 0:
                C65623tx r0 = (C65623tx) this.A00;
                UserSession userSession = r0.A02;
                String A0O = r0.A01.A0O(36, "");
                synchronized (AnonymousClass3RA.A00) {
                    A012 = AnonymousClass3Zs.A03(userSession).A01(D2R.A0K);
                }
                editor = A012.edit().putBoolean(A0O, true);
                break;
            case 3:
                SharedPreferences A04 = C28161tl.A04((UserSession) this.A00);
                editor = A04.edit().putInt("preference_feed_picker_nux_count", C18190wL.A04(A04, "preference_feed_picker_nux_count") + 1).putLong("preference_feed_picker_nux_last_seen_time", System.currentTimeMillis());
                break;
            default:
                return;
        }
        editor.apply();
    }

    public final void CPP(C25918DvM dvM) {
    }

    public final void CPQ(C25918DvM dvM) {
    }
}
