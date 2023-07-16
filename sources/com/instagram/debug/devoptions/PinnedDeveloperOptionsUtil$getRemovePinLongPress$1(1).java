package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C18200wM;
import X.C23411dm;
import X.C25828Dsm;
import X.C63813iO;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.debug.devoptions.api.DeveloperOptionsPlugin;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;

public final class PinnedDeveloperOptionsUtil$getRemovePinLongPress$1 implements View.OnLongClickListener {
    public final /* synthetic */ C23411dm $fragment;
    public final /* synthetic */ String $name;
    public final /* synthetic */ DeveloperOptionsPlugin.OnPinnedDevOptionInteraction $onPinnedDevOptionInteraction;

    public PinnedDeveloperOptionsUtil$getRemovePinLongPress$1(C23411dm r1, String str, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        this.$fragment = r1;
        this.$name = str;
        this.$onPinnedDevOptionInteraction = onPinnedDevOptionInteraction;
    }

    public final boolean onLongClick(final View view) {
        C25828Dsm A0V = AnonymousClass0wJ.A0V(this.$fragment);
        A0V.A0L(2131834607);
        A0V.A0p(AnonymousClass0wJ.A0l(this.$fragment.requireContext(), this.$name, 2131833997));
        final String str = this.$name;
        final DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction = this.$onPinnedDevOptionInteraction;
        A0V.A0P(new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DevOptionsHelper.Companion.removePinnedItemInPrefs(str);
                onPinnedDevOptionInteraction.onPinnedDevOptionRemoved();
                C63813iO.A0B(view.getContext(), AnonymousClass00U.A0L("Removed ", str));
            }
        }, 2131831976);
        A0V.A0r(true);
        C18200wM.A1P(A0V);
        AnonymousClass0wJ.A1K(A0V);
        return true;
    }
}
