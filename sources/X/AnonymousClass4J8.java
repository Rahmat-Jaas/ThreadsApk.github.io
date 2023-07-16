package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.4J8  reason: invalid class name */
public final class AnonymousClass4J8 implements C82924qU {
    public final C34640IcN A00;
    public final UserSession A01;
    public final Context A02;

    public AnonymousClass4J8(C34640IcN icN, UserSession userSession) {
        C04220Ms.A0B(icN, 1);
        this.A00 = icN;
        this.A01 = userSession;
        this.A02 = icN.requireContext();
    }

    public final void BN1(Uri uri, Bundle bundle) {
        Uri uri2 = uri;
        C04220Ms.A0B(uri2, 0);
        UserSession userSession = this.A01;
        TitleIcon titleIcon = new TitleIcon((ColorTint) null, R.drawable.reels_content_studio_ig_reels_pride_icon);
        Context context = this.A02;
        String string = context.getString(2131823912);
        IconConfig.IconWithTextConfig iconWithTextConfig = new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        String A0k = AnonymousClass0wJ.A0k(context, 2131823916);
        Integer A0e = C18230wP.A0e();
        AnonymousClass3Z9 r7 = new AnonymousClass3Z9(userSession, new PrimerBottomSheetConfig(titleIcon, "ClipsCameraWithTrendNuxActionHandler", AnonymousClass0wJ.A0k(context, 2131823920), AnonymousClass0wJ.A0k(context, 2131826195), C06750aI.A17(new InfoItem(iconWithTextConfig, A0e, A0k, string), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "2"), A0e, AnonymousClass0wJ.A0k(context, 2131823917), context.getString(2131823913)), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "3"), A0e, AnonymousClass0wJ.A0k(context, 2131823918), context.getString(2131823914)), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "4"), A0e, AnonymousClass0wJ.A0k(context, 2131823919), context.getString(2131823915))), 2131823921, false, false, false), (CharSequence) null, 316, true, true, false);
        r7.A01 = new IDxCListenerShape41S0300000_1_I2(51, (Object) r7, (Object) uri2, (Object) this);
        r7.A02 = C18210wN.A0H(r7, 57);
        r7.A03(context);
    }
}
