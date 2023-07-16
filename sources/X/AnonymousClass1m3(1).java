package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCallableShape89S0200000_4_I2;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.barcelona.R;
import com.instagram.common.task.IDxCallbackShape10S0400000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.1m3  reason: invalid class name */
public final class AnonymousClass1m3 extends BF4 {
    public final /* synthetic */ NametagController A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass1m3(NametagController nametagController, String str, String str2) {
        this.A00 = nametagController;
        this.A02 = str;
        this.A01 = str2;
    }

    public final boolean COg(View view) {
        int i;
        NametagController nametagController = this.A00;
        UserSession userSession = nametagController.A0F;
        C11630kW r10 = nametagController.A0E;
        C63673i6.A04(r10, userSession, userSession.getUserId(), "nametag_view", "download_qr_code");
        String str = this.A02;
        String str2 = nametagController.A02;
        if (str2 == null) {
            str2 = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s?r=nametag", (Object) str);
        }
        Context context = nametagController.A08;
        ViewGroup viewGroup = nametagController.mRootView;
        String str3 = this.A01;
        AnonymousClass0wJ.A1M(viewGroup, 1, r10);
        AnonymousClass0MQ r4 = new AnonymousClass0MQ();
        try {
            r4.A00 = Long.parseLong(str3);
        } catch (NumberFormatException e) {
            AnonymousClass0LU.A0K("DonwloadQRCodeUtil", "failed to parse entity id: %s", e, str3);
        }
        C13330nS A012 = C13330nS.A01(r10, userSession);
        View findViewById = viewGroup.findViewById(R.id.page_indicator);
        View findViewById2 = viewGroup.findViewById(R.id.profile_share_card);
        try {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height);
            int i2 = dimensionPixelSize << 1;
            if (findViewById2 != null) {
                i = findViewById2.getHeight();
            } else {
                i = 0;
            }
            Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), (viewGroup.getHeight() - i2) - i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -((float) dimensionPixelSize));
            if (findViewById2 != null) {
                findViewById2.setVisibility(4);
            }
            if (findViewById != null) {
                findViewById.setVisibility(4);
            }
            viewGroup.draw(canvas);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            H8a h8a = new H8a(new IDxCallableShape89S0200000_4_I2(45, context, createBitmap), 1775937301);
            Context context2 = context;
            h8a.A00 = new IDxCallbackShape10S0400000_1_I2(1, context2, r10, A012, r4);
            C31155GhB.A03(h8a);
        } catch (Exception unused) {
        }
        C63673i6.A0A(r10, userSession, userSession.getUserId(), "nametag_view", "download_qr_code", str2);
        return true;
    }
}
