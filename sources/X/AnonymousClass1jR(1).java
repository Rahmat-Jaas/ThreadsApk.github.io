package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape173S0200000_1_I2;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.1jR  reason: invalid class name */
public final class AnonymousClass1jR extends C90995fQ {
    public final /* bridge */ /* synthetic */ View A0O(Context context) {
        ConfirmationCodeEditText confirmationCodeEditText = new ConfirmationCodeEditText(context);
        confirmationCodeEditText.setOnLongClickListener(new IDxCListenerShape173S0200000_1_I2(1, confirmationCodeEditText, confirmationCodeEditText));
        return confirmationCodeEditText;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0P(android.view.View r16, X.AnonymousClass3HX r17, X.C127397h3 r18, java.lang.Object r19) {
        /*
            r15 = this;
            r14 = r16
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r14 = (com.instagram.ui.widget.edittext.ConfirmationCodeEditText) r14
            r11 = r17
            r12 = r18
            java.lang.Object r6 = X.AnonymousClass7K7.A04(r11, r12)
            X.33Q r6 = (X.AnonymousClass33Q) r6
            if (r6 == 0) goto L_0x0083
            r0 = 41
            java.lang.String r0 = r12.A0N(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0029
            float r0 = X.AnonymousClass7Kk.A01(r0)     // Catch:{ 1zB -> 0x0023 }
            int r0 = (int) r0     // Catch:{ 1zB -> 0x0023 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ 1zB -> 0x0023 }
            goto L_0x002a
        L_0x0023:
            r1 = move-exception
            java.lang.String r0 = "ConfirmationCodeTextInputNode"
            X.C30967GcS.A03(r0, r1)
        L_0x0029:
            r7 = r8
        L_0x002a:
            r0 = 35
            r5 = 1
            int r3 = r12.A0H(r0, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2 = 36
            boolean r1 = r12.A0T(r2, r5)
            r0 = 0
            r14.A06(r7, r4, r1, r0)
            boolean r0 = r12.A0T(r2, r5)
            r14.A04(r3, r0)
            r0 = 38
            X.6jp r1 = r12.A0L(r0)
            r10 = r15
            if (r1 == 0) goto L_0x0059
            X.1yF r0 = new X.1yF
            r0.<init>(r15, r11, r12, r1)
            r6.A00 = r0
            r14.addTextChangedListener(r0)
        L_0x0059:
            r0 = 40
            X.6jp r13 = r12.A0L(r0)
            X.3vx r9 = new X.3vx
            r9.<init>(r10, r11, r12, r13, r14)
            r14.setOnEditorActionListener(r9)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r0 = "com.instagram.android.WHATSAPP_OTP"
            r2.addAction(r0)
            X.40w r0 = new X.40w
            r0.<init>(r2, r15, r14, r3)
            X.0sd[] r1 = new X.C16190sd[]{r0}
            X.043 r0 = new X.043
            r0.<init>(r1)
            r14.A05(r0, r2)
            return r8
        L_0x0083:
            java.lang.String r0 = "A controller was defined for this component but none was found"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1jR.A0P(android.view.View, X.3HX, X.7h3, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r5, C127397h3 r6, Object obj, Object obj2) {
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) view;
        AnonymousClass33Q r1 = (AnonymousClass33Q) AnonymousClass7K7.A04(r5, r6);
        if (r1 != null) {
            TextWatcher textWatcher = r1.A00;
            if (textWatcher != null) {
                confirmationCodeEditText.removeTextChangedListener(textWatcher);
                r1.A00 = null;
            }
            C18250wR.A0t(confirmationCodeEditText);
            confirmationCodeEditText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
            BroadcastReceiver broadcastReceiver = confirmationCodeEditText.A05;
            if (broadcastReceiver != null) {
                confirmationCodeEditText.getContext().unregisterReceiver(broadcastReceiver);
                confirmationCodeEditText.A05 = null;
                return;
            }
            return;
        }
        throw C18250wR.A0V("A controller was defined for this component but none was found");
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        ConfirmationCodeEditText confirmationCodeEditText = new ConfirmationCodeEditText(context);
        confirmationCodeEditText.setOnLongClickListener(new IDxCListenerShape173S0200000_1_I2(1, confirmationCodeEditText, confirmationCodeEditText));
        return confirmationCodeEditText;
    }

    public AnonymousClass1jR(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }
}
