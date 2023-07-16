package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.83B  reason: invalid class name */
public final class AnonymousClass83B implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ReadableMap A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ double A04;
    public final /* synthetic */ IgReactNavigatorModule A05;

    public AnonymousClass83B(ReadableMap readableMap, IgReactNavigatorModule igReactNavigatorModule, String str, String str2, double d, int i) {
        this.A05 = igReactNavigatorModule;
        this.A04 = d;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = readableMap;
        this.A00 = i;
    }

    public final void run() {
        boolean z;
        Activity currentActivity = this.A05.getCurrentActivity();
        if ((currentActivity instanceof FragmentActivity) && currentActivity != null && C1186671u.A01(currentActivity, (int) this.A04) && (currentActivity instanceof C82044oz)) {
            E2V A032 = E2V.A03(currentActivity);
            IDxCListenerShape203S0100000_2_I2 A0P = C86134wK.A0P(this, 153);
            A032.CpF(this.A03, A0P);
            String str = this.A02;
            if (str != null) {
                z = true;
                if (str.equals("loading")) {
                    A032.setIsLoading(true);
                    return;
                } else if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                    A032.CtQ((View.OnClickListener) null, false);
                    return;
                } else {
                    ReadableMap readableMap = this.A01;
                    if (readableMap.hasKey("enabled")) {
                        z = readableMap.getBoolean("enabled");
                    }
                    int i = this.A00;
                    int contentDescriptionForIconType = IgReactNavigatorModule.contentDescriptionForIconType(str);
                    ActionButton actionButton = A032.A0R;
                    actionButton.setVisibility(0);
                    actionButton.setButtonResource(i);
                    actionButton.setOnClickListener(A0P);
                    ViewGroup viewGroup = A032.A0K;
                    actionButton.setBackgroundResource(C86104wH.A0G(viewGroup.getContext(), R.attr.actionBarBackground).resourceId);
                    actionButton.setColorFilter(C63393hP.A01(actionButton.getContext(), R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color));
                    actionButton.setContentDescription(viewGroup.getResources().getString(contentDescriptionForIconType));
                    A032.setIsLoading(false);
                }
            } else {
                ReadableMap readableMap2 = this.A01;
                if (readableMap2.hasKey("enabled")) {
                    z = readableMap2.getBoolean("enabled");
                } else {
                    return;
                }
            }
            A032.AJT(z);
        }
    }
}
