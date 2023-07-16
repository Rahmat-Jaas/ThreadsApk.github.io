package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxPCallbackShape480S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xa  reason: invalid class name and case insensitive filesystem */
public final class C29241xa extends C23411dm implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "BackupCodesFragment";
    public Dialog A00;
    public C313225m A01;
    public UserSession A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public final C63873iU A06 = C63873iU.A06(this, 61);

    public final String getModuleName() {
        return "backup_codes";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        if (!this.A03) {
            return false;
        }
        this.mFragmentManager.A1C((String) null, 1);
        this.A03 = false;
        return true;
    }

    public static List A0B(C29241xa r5) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Bundle bundle = r5.mArguments;
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("backup_codes_key");
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass4MA.A02((View.OnClickListener) null, C18180wK.A0k(it), A0v);
            }
            AnonymousClass4MA.A03(C18190wL.A0H(r5, 493), A0v, 2131821826);
            C63293hC.A00(r5, A0v, 2131821827);
            AnonymousClass4MA.A03(C18200wM.A0R(stringArrayList, r5, 129), A0v, 2131821825);
            AnonymousClass4MA.A03(C18190wL.A0H(r5, 494), A0v, 2131821831);
            C63293hC.A00(r5, A0v, 2131821830);
        }
        return A0v;
    }

    public static void A0C(C29241xa r5) {
        Activity parent = r5.getActivity().getParent();
        Activity activity = r5.getActivity();
        if (parent != null) {
            activity = activity.getParent();
        }
        if (Build.VERSION.SDK_INT >= 33 || C18180wK.A1W(activity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE"))) {
            r5.A04 = true;
            C18180wK.A11(r5);
            ViewGroup A0H = C18200wM.A0H(r5);
            Context context = r5.getContext();
            if (context != null) {
                A0H.setBackground(new ColorDrawable(C121907Is.A00(context, R.attr.backgroundColorPrimary)));
            }
            A0H.setDrawingCacheEnabled(true);
            Bitmap drawingCache = A0H.getDrawingCache();
            C13760oG.A00(drawingCache);
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
            A0H.setDrawingCacheEnabled(false);
            A0H.setBackground((Drawable) null);
            C31155GhB.A03(new C25071li(createBitmap, r5));
            return;
        }
        AnonymousClass7K8.A02(activity, new IDxPCallbackShape480S0100000_1_I2(r5, 0), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A07(r3, 2131821828);
        r3.CtQ((View.OnClickListener) null, this.A04);
        r3.setIsLoading(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1263254357);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(-1004395708, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C313225m r0;
        int A022 = C14030oh.A02(159627732);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            r0 = C313225m.ARGUMENT_DEFAULT_FLOW;
        } else {
            r0 = C313225m.values()[bundle2.getInt("flow_key")];
        }
        this.A01 = r0;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C14030oh.A09(-1132496796, A022);
        return onCreateView;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-959580197);
        super.onPause();
        getRootActivity();
        C14030oh.A09(-1855505953, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(203759027);
        super.onResume();
        setItems(A0B(this));
        if (C313225m.ARGUMENT_TWOFAC_FLOW == this.A01 && !C18190wL.A1X(C18200wM.A0C(), "has_backup_codes") && !this.A05) {
            this.A03 = true;
            Dialog dialog = this.A00;
            if (dialog == null) {
                C25828Dsm A0W = C18190wL.A0W(getContext());
                A0W.A0L(2131837147);
                A0W.A0K(2131837146);
                C18180wK.A1O(A0W, this, 85, 2131831976);
                C18180wK.A1N(A0W, this, 84, 2131823054);
                dialog = A0W.A0G();
                this.A00 = dialog;
            }
            C13950oZ.A00(dialog);
        }
        getRootActivity();
        C14030oh.A09(1149290457, A022);
    }
}
