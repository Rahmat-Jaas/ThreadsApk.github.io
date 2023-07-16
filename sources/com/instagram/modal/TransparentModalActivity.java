package com.instagram.modal;

import X.AnonymousClass000;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.I17;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import com.instagram.barcelona.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TransparentModalActivity extends ModalActivity {
    public boolean A0H() {
        return false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putStringArrayList("arg_cleanup_bottom_sheet_fragments", C18200wM.A0s(Collections.singletonList(I17.A00(359))));
        super.onSaveInstanceState(bundle);
    }

    public final void A0A() {
        if (A0H()) {
            super.A0A();
        } else {
            setTheme(R.style.IgTranslucentWindowPanavisionSoftUpdateButtons);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        int A00 = C14030oh.A00(-606044621);
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("arg_cleanup_bottom_sheet_fragments");
            ClassLoader classLoader = getClassLoader();
            if (!(stringArrayList == null || stringArrayList.isEmpty() || (bundle2 = bundle.getBundle(AnonymousClass000.A00(768))) == null || (bundle3 = bundle2.getBundle("android:support:fragments")) == null)) {
                bundle3.setClassLoader(classLoader);
                FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                if (fragmentManagerState != null) {
                    AnonymousClass0LU.A0C("IgFragmentManagerHacks", "Updating fragmentManagerState");
                    Iterator<String> it = bundle3.keySet().iterator();
                    while (it.hasNext()) {
                        String A0k = C18180wK.A0k(it);
                        if (A0k.startsWith("fragment_") && (bundle4 = bundle3.getBundle(A0k)) != null) {
                            bundle4.setClassLoader(classLoader);
                            FragmentState fragmentState = (FragmentState) bundle4.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                            if (stringArrayList.contains(fragmentState.A06)) {
                                ArrayList arrayList = fragmentManagerState.A05;
                                String str = fragmentState.A07;
                                arrayList.remove(str);
                                fragmentManagerState.A06.remove(str);
                                it.remove();
                            }
                        }
                    }
                    BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.A07;
                    if (backStackRecordStateArr != null) {
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        for (BackStackRecordState backStackRecordState : backStackRecordStateArr) {
                            if (!stringArrayList.contains(backStackRecordState.A06)) {
                                A0v.add(backStackRecordState);
                            }
                        }
                        fragmentManagerState.A07 = (BackStackRecordState[]) A0v.toArray(new BackStackRecordState[A0v.size()]);
                    }
                    bundle3.putParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, fragmentManagerState);
                }
            }
        }
        super.onCreate(bundle);
        C14030oh.A07(439224304, A00);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A0I(intent);
    }
}
