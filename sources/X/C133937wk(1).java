package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.7wk  reason: invalid class name and case insensitive filesystem */
public final class C133937wk implements C27991Ewf {
    public final Fragment A00;
    public final int A01;

    public final Fragment Ajj() {
        return this.A00;
    }

    public final int B7O() {
        return this.A01;
    }

    public final C27825Etu B98() {
        Fragment fragment = this.A00;
        if (fragment instanceof C27825Etu) {
            return (C27825Etu) fragment;
        }
        return null;
    }

    public final FragmentActivity getActivity() {
        return this.A00.getActivity();
    }

    public final Context getContext() {
        return this.A00.getContext();
    }

    public final View getRootView() {
        return this.A00.mView;
    }

    public final boolean isResumed() {
        return this.A00.isResumed();
    }

    public C133937wk(Fragment fragment, int i) {
        this.A00 = fragment;
        this.A01 = i;
    }

    public C133937wk(Fragment fragment) {
        this(fragment, -1);
    }
}
