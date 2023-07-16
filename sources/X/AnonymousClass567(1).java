package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape167S0100000_I2;

/* renamed from: X.567  reason: invalid class name */
public abstract class AnonymousClass567 extends Fragment {
    public AnonymousClass4x8 A00;
    public final AnonymousClass6S2 A01;

    public static ContextThemeWrapper A00(AnonymousClass567 r1, Object obj) {
        C04220Ms.A0B(obj, 0);
        AnonymousClass4x8 r2 = r1.A00;
        if (r2 != null) {
            AnonymousClass7Kz.A0G();
            return new ContextThemeWrapper(r2, R.style.FBPayUIWidget);
        }
        C04220Ms.A0E("contextResourcesWrapper");
        throw null;
    }

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
        this.A00 = new AnonymousClass4x8(context, this.A01);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C04220Ms.A0B(configuration, 0);
        C04220Ms.A06(AnonymousClass0wJ.A0B(this));
        super.onConfigurationChanged(configuration);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        if (!(this instanceof AnonymousClass5j3) || !((AnonymousClass5j3) this).A0K) {
            AnonymousClass7KT.A06(this, "");
            AnonymousClass7KT.A04(this, (AnonymousClass697) null);
            AnonymousClass7KT.A05(this, (AnonymousClass697) null, (String) null);
            AnonymousClass7KT.A00((View.OnClickListener) null, this);
            AnonymousClass5qq A0S = C86134wK.A0S(this);
            C86024w9 r1 = A0S.A0I;
            AnonymousClass0A5[] r4 = AnonymousClass5qq.A0V;
            C86114wI.A1L(A0S, (Object) null, r1, r4, 4);
            C86114wI.A1L(A0S, (Object) null, A0S.A0G, r4, 15);
            Fragment fragment = this.mParentFragment;
            C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            AnonymousClass5qq r2 = (AnonymousClass5qq) fragment;
            C86114wI.A1L(r2, (Object) null, r2.A0H, r4, 12);
            AnonymousClass7KT.A07(this, (String) null, (String) null);
            AnonymousClass7KT.A01((View.OnClickListener) null, this);
            Fragment fragment2 = this.mParentFragment;
            C04220Ms.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            AnonymousClass5qq r22 = (AnonymousClass5qq) fragment2;
            C86114wI.A1L(r22, (Object) null, r22.A0K, r4, 5);
            C86114wI.A1L(r22, (Object) null, r22.A0J, r4, 17);
            Fragment fragment3 = this.mParentFragment;
            C04220Ms.A0C(fragment3, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
            AnonymousClass5qq r23 = (AnonymousClass5qq) fragment3;
            C86114wI.A1L(r23, (Object) null, r23.A0L, r4, 13);
            AnonymousClass7KT.A08(this, false);
        }
    }

    public static C91705gf A01(AnonymousClass69U r2, LoggingContext loggingContext, Object obj, Map map, int i) {
        return new C91705gf(r2, loggingContext, map, new KtLambdaShape167S0100000_I2(obj, i));
    }

    public AnonymousClass567() {
        AnonymousClass6S2 A0F = AnonymousClass7Kz.A0F();
        C04220Ms.A06(A0F);
        this.A01 = A0F;
    }

    public static LoggingContext A02(Fragment fragment) {
        Parcelable parcelable = fragment.requireArguments().getParcelable("logging_context");
        C04220Ms.A0C(parcelable, "null cannot be cast to non-null type com.fbpay.logging.LoggingContext");
        return (LoggingContext) parcelable;
    }

    public void onResume() {
        int A02 = C14030oh.A02(745891103);
        super.onResume();
        C04220Ms.A06(AnonymousClass0wJ.A0B(this));
        C14030oh.A09(-2117758440, A02);
    }
}
