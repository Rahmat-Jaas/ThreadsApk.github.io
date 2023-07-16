package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.redex.IDxHDelegateShape497S0100000_2_I2;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape28S0200000_I2_12;
import kotlin.jvm.internal.KtLambdaShape77S0100000_I2_57;

/* renamed from: X.5xW  reason: invalid class name */
public final class AnonymousClass5xW extends C34640IcN implements C21735BzM, L03 {
    public static final String __redex_internal_original_name = "GroupProfileEditorComposeFragment";
    public C84584tU A00;
    public C108276i6 A01;
    public boolean A02;
    public boolean A03;
    public String A04;
    public final C04530Oa A05 = AnonymousClass3W9.A00(this);
    public final C04530Oa A06;
    public final IDxHDelegateShape497S0100000_2_I2 A07;

    public final boolean AIS() {
        return false;
    }

    public final int Agu() {
        return 0;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C84584tU r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("captureFlowHelper");
            throw null;
        } else {
            r0.onSaveInstanceState(bundle);
        }
    }

    public final boolean BYC() {
        return this.A02;
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final boolean isScrolledToTop() {
        return this.A03;
    }

    public AnonymousClass5xW() {
        KtLambdaShape77S0100000_I2_57 A12 = C86164wN.A12(this, 14);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, C86164wN.A12(C86164wN.A12(this, 11), 12));
        this.A06 = C18220wO.A0M(C86164wN.A12(A012, 13), A12, new KtLambdaShape28S0200000_I2_12(29, (Object) null, (Object) A012), C18210wN.A0l(AnonymousClass56W.class));
        this.A03 = true;
        this.A02 = true;
        this.A04 = "group_profile_editor_compose_fragment_create";
        this.A07 = new IDxHDelegateShape497S0100000_2_I2(this, 2);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C84584tU r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("captureFlowHelper");
            throw null;
        } else {
            r0.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String[] stringArray;
        String string;
        int A022 = C14030oh.A02(284597090);
        super.onCreate(bundle);
        C84584tU A023 = C25529DnJ.A02.A02(requireContext(), this.A07, AnonymousClass0wJ.A0X(this.A05));
        this.A00 = A023;
        List list = null;
        A023.CH2(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("group_profile_id")) == null) {
            AnonymousClass56W r5 = (AnonymousClass56W) this.A06.getValue();
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str = bundle3.getString("thread_id");
            } else {
                str = null;
            }
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                str2 = bundle4.getString("thread_name");
            } else {
                str2 = null;
            }
            Bundle bundle5 = this.mArguments;
            if (!(bundle5 == null || (stringArray = bundle5.getStringArray("thread_participant_ids")) == null)) {
                list = Arrays.asList(stringArray);
                C04220Ms.A06(list);
            }
            r5.A0I(str, str2, list);
        } else {
            ((AnonymousClass56W) this.A06.getValue()).A0F(string);
            this.A04 = "group_profile_editor_compose_fragment_edit";
        }
        C14030oh.A09(653922002, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1463552922);
        ComposeView A0L = C18200wM.A0L(this, new KtLambdaShape169S0100000_I2_2(this, 12), 134567982);
        C14030oh.A09(-1582759373, A022);
        return A0L;
    }
}
