package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.barcelona.R;
import java.util.Collection;
import java.util.UUID;
import kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7;

/* renamed from: X.5xZ  reason: invalid class name */
public final class AnonymousClass5xZ extends AnonymousClass9NU {
    public static final String __redex_internal_original_name = "AppreciationCreatorInsightsInfoBottomSheetFragment";
    public final C04530Oa A00 = AnonymousClass0OY.A02(new KtLambdaShape27S0100000_I2_7(this, 42));
    public final C04530Oa A01 = AnonymousClass3W9.A00(this);

    public final String getModuleName() {
        return C18170wI.A00(600);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CreatorLoggingData A002 = AnonymousClass6LK.A00(requireArguments());
        ((C122027Jo) this.A00.getValue()).A07(Boolean.valueOf(A002.A01), Boolean.valueOf(A002.A02), AnonymousClass006.A1L, A002.A00);
        String A0g = C18180wK.A0g(this, 2131821372);
        C304721l r5 = C304721l.LOADED;
        String A0g2 = C18180wK.A0g(this, 2131821373);
        String A0o = AnonymousClass0wJ.A0o(this, A0g, 2131821371);
        C04220Ms.A06(A0o);
        updateUi(r5, C06750aI.A17(new AnonymousClass5MJ(A0g2, A0o, C18180wK.A0n(new KtCSuperShape0S2200000_I2(C171209wF.A0j, A0g, (AnonymousClass0ZU) C86154wM.A11(A002, this, 44)))), new C154109Am((Integer) null, (Integer) null, C18190wL.A0n(UUID.randomUUID()), R.dimen.add_account_icon_circle_radius)));
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new AnonymousClass60M(requireActivity(), AnonymousClass0wJ.A0X(this.A01)), new AnonymousClass9VR());
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C78354iI.A00);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }
}
