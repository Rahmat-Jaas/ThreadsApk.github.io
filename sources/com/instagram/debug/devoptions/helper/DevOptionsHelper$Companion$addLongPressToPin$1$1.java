package com.instagram.debug.devoptions.helper;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C25828Dsm;
import X.C63813iO;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;

public final class DevOptionsHelper$Companion$addLongPressToPin$1$1 implements View.OnLongClickListener {
    public final /* synthetic */ DevOptionsHelper.OnPinnedDevOptionItemAdded $onPinnedDevOptionItemAdded;
    public final /* synthetic */ AnonymousClass4MA $this_apply;

    public DevOptionsHelper$Companion$addLongPressToPin$1$1(AnonymousClass4MA r1, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        this.$this_apply = r1;
        this.$onPinnedDevOptionItemAdded = onPinnedDevOptionItemAdded;
    }

    public final boolean onLongClick(View view) {
        final Context context = view.getContext();
        AnonymousClass4MA r1 = this.$this_apply;
        CharSequence charSequence = r1.A05;
        if (charSequence == null) {
            charSequence = context.getString(r1.A02);
        }
        final String charSequence2 = charSequence.toString();
        C04220Ms.A06(charSequence2);
        if (DevOptionsHelper.Companion.isPinnedItem(charSequence2)) {
            return false;
        }
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(2131821015);
        A0W.A0p(AnonymousClass0wJ.A0l(context, charSequence2, 2131833996));
        final DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded = this.$onPinnedDevOptionItemAdded;
        A0W.A0P(new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DevOptionsHelper.Companion.storePinnedItemInPrefs(charSequence2);
                onPinnedDevOptionItemAdded.onMenuItemAdded();
                C63813iO.A0B(context, AnonymousClass00U.A0L("Added ", charSequence2));
            }
        }, 2131831976);
        A0W.A0r(true);
        C18200wM.A1P(A0W);
        AnonymousClass0wJ.A1K(A0W);
        return true;
    }
}
