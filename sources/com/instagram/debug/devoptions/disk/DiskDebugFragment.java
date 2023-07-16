package com.instagram.debug.devoptions.disk;

import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4UR;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C18200wM;
import X.C23411dm;
import X.C62153Xk;
import X.C63273h9;
import X.C63613hu;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.api.DevOptionsPreferenceAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class DiskDebugFragment extends C23411dm implements C82034oy {
    public final C04530Oa adapter$delegate = new AnonymousClass4UR(new DiskDebugFragment$adapter$2(this));
    public C10300i6 session;

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.CtO(true);
        r2.CtT(true);
        r2.Cqb(2131825160);
    }

    public String getModuleName() {
        return "disk_debug_activity";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        refreshData();
    }

    private final DevOptionsPreferenceAdapter getAdapter() {
        return (DevOptionsPreferenceAdapter) this.adapter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void startClearTask(List list) {
        schedule(new DiskDebugFragment$startClearTask$1(list, this));
    }

    /* access modifiers changed from: private */
    public final void startWriteTask(File file) {
        schedule(new DiskDebugFragment$startWriteTask$1(file, this));
    }

    public C10300i6 getSession() {
        return this.session;
    }

    /* access modifiers changed from: private */
    public final void refreshData() {
        FragmentActivity requireActivity = requireActivity();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A03(A0v, 2131825146);
        AnonymousClass4MA.A03(new DiskDebugFragment$refreshData$1(this), A0v, 2131825159);
        AnonymousClass4MA.A03(new DiskDebugFragment$refreshData$2(this), A0v, 2131825144);
        AnonymousClass4MA.A03(new DiskDebugFragment$refreshData$3(this), A0v, 2131825142);
        AnonymousClass4MA.A03(new DiskDebugFragment$refreshData$4(this), A0v, 2131825145);
        AnonymousClass4MA.A03(new DiskDebugFragment$refreshData$5(this), A0v, 2131825143);
        AnonymousClass4MA.A03(new DiskDebugFragment$refreshData$6(this), A0v, 2131825164);
        AnonymousClass4MA.A03(new DiskDebugFragment$refreshData$7(this), A0v, 2131825165);
        C63613hu.A03(A0v, 2131825157);
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825153), A0v, DiskUtils.getInternalCacheUsed(requireActivity));
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825155), A0v, DiskUtils.getFileTotalSize(requireActivity));
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825156), A0v, DiskUtils.getInternalOtherUsed(requireActivity));
        C63273h9.A02(A0v);
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825154), A0v, DiskUtils.getTotalInternalDataUsed(requireActivity));
        C63273h9.A02(A0v);
        C63613hu.A03(A0v, 2131825150);
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825148), A0v, DiskUtils.getExternalFileTotalSize(requireActivity));
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825147), A0v, DiskUtils.getExternalCacheUsed(requireActivity));
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825149), A0v, DiskUtils.getExternalMediaTotalSize(requireActivity));
        C63273h9.A02(A0v);
        long totalDataFootprint = DiskUtils.getTotalDataFootprint(requireActivity);
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825162), A0v, totalDataFootprint);
        long totalCaches = DiskUtils.getTotalCaches(requireActivity);
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825161), A0v, totalCaches);
        C63273h9.A02(A0v);
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825163), A0v, totalDataFootprint + totalCaches);
        C63273h9.A02(A0v);
        C63613hu.A03(A0v, 2131825140);
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825141), A0v, DiskUtils.getAvailableInternal());
        C23411dm.A09(new C62153Xk((View.OnClickListener) null, 2131825139), A0v, DiskUtils.getAvailableExternal());
        C63273h9.A02(A0v);
        getScrollingViewProxy().ChZ(getAdapter());
        getAdapter().setUnfilteredItems(A0v);
        getAdapter().getFilter().filter((CharSequence) null);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1512525796);
        super.onCreate(bundle);
        this.session = C18200wM.A0V(this);
        C14030oh.A09(-91694841, A02);
    }
}
