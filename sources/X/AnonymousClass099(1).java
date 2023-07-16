package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

/* renamed from: X.099  reason: invalid class name */
public class AnonymousClass099 extends Fragment implements DialogInterface.OnDismissListener, DialogInterface.OnCancelListener {
    public int A00 = -1;
    public int A01 = 0;
    public Dialog A02;
    public DialogInterface.OnCancelListener A03 = new C009204b(this);
    public DialogInterface.OnDismissListener A04 = new C009304c(this);
    public boolean A05 = true;
    public boolean A06;
    public boolean A07 = false;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B;
    public int A0C = 0;
    public Handler A0D;
    public C143158gC A0E = new AnonymousClass04d(this);
    public Runnable A0F = new C009104a(this);

    public void A06() {
        A00(false, false);
    }

    public void A07() {
        A00(true, false);
    }

    public final void A08(int i, int i2) {
        C12560m7.A0E(2);
        this.A01 = i;
        if (i == 2) {
            this.A0C = 16973913;
        }
        this.A0C = i2;
    }

    public void A09(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void A0A(C12560m7 r4, String str) {
        this.A08 = false;
        this.A09 = true;
        AnonymousClass01J r0 = new AnonymousClass01J(r4);
        r0.A0G = true;
        r0.A0E(this, str);
        r0.A0L(false);
    }

    public Dialog A0C(Bundle bundle) {
        C12560m7.A0E(3);
        return new AnonymousClass0SK(requireContext(), A04());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    private void A00(boolean z, boolean z2) {
        if (!this.A08) {
            this.A08 = true;
            this.A09 = false;
            Dialog dialog = this.A02;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.A02.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.A0D.getLooper()) {
                        onDismiss(this.A02);
                    } else {
                        this.A0D.post(this.A0F);
                    }
                }
            }
            this.A0B = true;
            int i = this.A00;
            C12560m7 parentFragmentManager = getParentFragmentManager();
            if (i >= 0) {
                parentFragmentManager.A0f(this.A00, 1, z);
                this.A00 = -1;
                return;
            }
            AnonymousClass01J r0 = new AnonymousClass01J(parentFragmentManager);
            r0.A0G = true;
            r0.A04(this);
            if (z) {
                r0.A0L(true);
            } else {
                r0.A0L(false);
            }
        }
    }

    public final Dialog A05() {
        Dialog dialog = this.A02;
        if (dialog != null) {
            return dialog;
        }
        StringBuilder sb = new StringBuilder("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public final void A0B(boolean z) {
        this.A05 = z;
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public final C010204r createFragmentContainer() {
        return new AnonymousClass00G(this, new AnonymousClass039(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.A0B) {
            C12560m7.A0E(3);
            A00(true, true);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.A02;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.A01;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.A0C;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.A05;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.A0A;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.A00;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public int A04() {
        return this.A0C;
    }

    public void onActivityCreated(Bundle bundle) {
        int A022 = C14030oh.A02(1684930327);
        super.onActivityCreated(bundle);
        C14030oh.A09(1880406405, A022);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().A0E(this.A0E);
        if (!this.A09) {
            this.A08 = false;
        }
    }

    public void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1208297191);
        super.onCreate(bundle);
        this.A0D = new Handler();
        boolean z = false;
        if (this.mContainerId == 0) {
            z = true;
        }
        this.A0A = z;
        if (bundle != null) {
            this.A01 = bundle.getInt("android:style", 0);
            this.A0C = bundle.getInt("android:theme", 0);
            this.A05 = bundle.getBoolean("android:cancelable", true);
            this.A0A = bundle.getBoolean("android:showsDialog", this.A0A);
            this.A00 = bundle.getInt("android:backStackId", -1);
        }
        C14030oh.A09(-441591193, A022);
    }

    public void onDestroyView() {
        int A022 = C14030oh.A02(-563155941);
        super.onDestroyView();
        Dialog dialog = this.A02;
        if (dialog != null) {
            this.A0B = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.A02.dismiss();
            if (!this.A08) {
                onDismiss(this.A02);
            }
            this.A02 = null;
            this.A07 = false;
        }
        C14030oh.A09(618176553, A022);
    }

    public void onDetach() {
        int A022 = C14030oh.A02(-1242039940);
        super.onDetach();
        if (!this.A09 && !this.A08) {
            this.A08 = true;
        }
        getViewLifecycleOwnerLiveData().A0F(this.A0E);
        C14030oh.A09(336420265, A022);
    }

    /* JADX INFO: finally extract failed */
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflater = getLayoutInflater(bundle);
        boolean z = this.A0A;
        if (!z || this.A06) {
            C12560m7.A0E(2);
        } else {
            if (z && !this.A07) {
                try {
                    this.A06 = true;
                    Dialog A0C2 = A0C(bundle);
                    this.A02 = A0C2;
                    if (this.A0A) {
                        A09(A0C2, this.A01);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.A02.setOwnerActivity((Activity) context);
                        }
                        this.A02.setCancelable(this.A05);
                        this.A02.setOnCancelListener(this.A03);
                        this.A02.setOnDismissListener(this.A04);
                        this.A07 = true;
                    } else {
                        this.A02 = null;
                    }
                    this.A06 = false;
                } catch (Throwable th) {
                    this.A06 = false;
                    throw th;
                }
            }
            C12560m7.A0E(2);
            Dialog dialog = this.A02;
            if (dialog != null) {
                return layoutInflater.cloneInContext(dialog.getContext());
            }
        }
        return layoutInflater;
    }

    public void onStart() {
        int A022 = C14030oh.A02(-105500898);
        super.onStart();
        Dialog dialog = this.A02;
        if (dialog != null) {
            this.A0B = false;
            C13950oZ.A00(dialog);
            View decorView = this.A02.getWindow().getDecorView();
            C116066wM.A01(decorView, this);
            C04220Ms.A0B(decorView, 0);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        C14030oh.A09(-212315428, A022);
    }

    public void onStop() {
        int A022 = C14030oh.A02(88987751);
        super.onStop();
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.hide();
        }
        C14030oh.A09(969999624, A022);
    }

    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        int A022 = C14030oh.A02(-1307846882);
        super.onViewStateRestored(bundle);
        if (!(this.A02 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null)) {
            this.A02.onRestoreInstanceState(bundle2);
        }
        C14030oh.A09(1368637645, A022);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.A02 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.A02.onRestoreInstanceState(bundle2);
        }
    }
}
