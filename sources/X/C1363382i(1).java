package X;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.82i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1363382i implements Runnable {
    public final /* synthetic */ C104276bW A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ Object A03;

    public /* synthetic */ C1363382i(C104276bW r1, AnonymousClass3HX r2, C127397h3 r3, Object obj) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = obj;
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        C127397h3 A002;
        AnonymousClass3HX r2 = this.A01;
        C127397h3 r7 = this.A02;
        C104276bW r6 = this.A00;
        Object obj = this.A03;
        try {
            str = r7.A0O(35, (String) null);
            if (str == null) {
                throw C18250wR.A0V("Popup does not have an anchor view id");
            }
        } catch (ClassCastException unused) {
            long A0I = r7.A0I(35, 0);
            if (A0I != 0) {
                str = Long.toString(A0I);
            } else {
                throw C18250wR.A0V("Popup does not have an anchor view id");
            }
        }
        C110936mW r0 = AnonymousClass7K7.A01(r2).A03;
        if (r0 == null || (A002 = AnonymousClass7r5.A00(r0.A02, str)) == null) {
            C30967GcS.A02("BKBloksComponentsCdsInternalPopupBinderUtil", String.format("Could not find component with anchor view id: %s", new Object[]{str}));
        } else {
            View A0J = A002.A0J(r2);
            if (!(A0J == null && (A0J = AnonymousClass6G0.A00(r2, A002)) == null)) {
                PopupWindow popupWindow = r6.A00;
                List A0R = r7.A0R(32);
                if (A0R.size() < 1) {
                    str2 = "BKBloksComponentsCdsInternalPopupBinderUtil";
                    str3 = "Popup must have a child element.";
                    C30967GcS.A02(str2, str3);
                }
                int[] iArr = (int[]) obj;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A0J.getWidth(), View.MeasureSpec.getMode(iArr[0]));
                Context context = r2.A00;
                AnonymousClass7Di r5 = AnonymousClass7J7.A03(AnonymousClass7J7.A00(context, (AnonymousClass7J7) null, r2, AnonymousClass2LE.A00(r2), -1), (C143468gn) A0R.get(0), (Object) null, makeMeasureSpec, iArr[1]).A02;
                View contentView = popupWindow.getContentView();
                AnonymousClass0SJ.A00(contentView);
                ((LLH) contentView).setRenderTree(r5);
                float A0G = r7.A0G(36, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                float A0G2 = r7.A0G(38, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                int round = Math.round(AnonymousClass3W1.A00(context, A0G));
                int round2 = Math.round(AnonymousClass3W1.A00(context, A0G2));
                if (C98926Hl.A00(context)) {
                    round = (-AnonymousClass7Di.A01(r5)) - round;
                }
                popupWindow.showAsDropDown(A0J, round, round2);
                return;
            }
        }
        str2 = "BKBloksComponentsCdsInternalPopupBinderUtil";
        str3 = "Popup cannot find text input view to anchor to";
        C30967GcS.A02(str2, str3);
    }
}
