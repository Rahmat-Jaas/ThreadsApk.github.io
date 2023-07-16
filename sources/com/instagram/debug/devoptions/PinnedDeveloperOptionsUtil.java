package com.instagram.debug.devoptions;

import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C23411dm;
import android.view.View;
import com.instagram.debug.devoptions.api.DeveloperOptionsPlugin;

public final class PinnedDeveloperOptionsUtil {
    public static final PinnedDeveloperOptionsUtil INSTANCE = new PinnedDeveloperOptionsUtil();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.4MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.4MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.4MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.4MC} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List getPinnedDevOptions(com.instagram.service.session.UserSession r10, X.C23411dm r11, com.instagram.debug.devoptions.api.DeveloperOptionsPlugin.OnPinnedDevOptionInteraction r12) {
        /*
            r7 = r10
            r9 = r11
            X.AnonymousClass0wJ.A1N(r10, r11)
            r0 = 2
            X.C04220Ms.A0B(r12, r0)
            android.content.Context r0 = r11.getContext()
            if (r0 != 0) goto L_0x0012
            X.0ZV r6 = X.AnonymousClass0ZV.A00
        L_0x0011:
            return r6
        L_0x0012:
            com.instagram.debug.devoptions.helper.DevOptionsHelper$Companion r2 = com.instagram.debug.devoptions.helper.DevOptionsHelper.Companion
            java.util.List r1 = r2.getPinnedItems()
            com.instagram.debug.devoptions.helper.DevOptionsHelper r0 = r2.getInstance(r10)
            java.util.Map r3 = r0._optionNameToMenuItems
            com.instagram.debug.devoptions.helper.DevOptionsHelper r0 = r2.getInstance(r10)
            java.util.Map r2 = r0._optionNameToSwitchItems
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0047
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0047
            com.instagram.debug.devoptions.DeveloperOptionsFragment$Companion r4 = com.instagram.debug.devoptions.DeveloperOptionsFragment.Companion
            android.content.Context r5 = r11.requireContext()
            androidx.fragment.app.FragmentActivity r6 = r11.requireActivity()
            X.06E r8 = X.AnonymousClass06E.A00(r11)
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            com.instagram.debug.devoptions.DeveloperOptionsFragment$Companion$collectDevOptionItems$1 r11 = com.instagram.debug.devoptions.DeveloperOptionsFragment$Companion$collectDevOptionItems$1.INSTANCE
            r4.collectDevOptionItems(r5, r6, r7, r8, r9, r10, r11)
        L_0x0047:
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r5 = r1.iterator()
        L_0x004f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.String r4 = X.C18180wK.A0k(r5)
            java.lang.Object r1 = r3.get(r4)
            X.4MA r1 = (X.AnonymousClass4MA) r1
            if (r1 == 0) goto L_0x0073
            com.instagram.debug.devoptions.PinnedDeveloperOptionsUtil$getPinnedDevOptions$1$rageShakeItem$1 r0 = new com.instagram.debug.devoptions.PinnedDeveloperOptionsUtil$getPinnedDevOptions$1$rageShakeItem$1
            r0.<init>(r12, r1)
            X.4MA r1 = X.AnonymousClass4MA.A01(r0, r4)
            com.instagram.debug.devoptions.PinnedDeveloperOptionsUtil r0 = INSTANCE
            r0.enableRemovingPinnedOption((java.lang.String) r4, (X.AnonymousClass4MA) r1, (X.C23411dm) r9, (com.instagram.debug.devoptions.api.DeveloperOptionsPlugin.OnPinnedDevOptionInteraction) r12)
        L_0x006f:
            r6.add(r1)
            goto L_0x004f
        L_0x0073:
            java.lang.Object r1 = r2.get(r4)
            X.4MC r1 = (X.AnonymousClass4MC) r1
            if (r1 == 0) goto L_0x004f
            com.instagram.debug.devoptions.PinnedDeveloperOptionsUtil r0 = INSTANCE
            r0.enableRemovingPinnedOption((java.lang.String) r4, (X.AnonymousClass4MC) r1, (X.C23411dm) r9, (com.instagram.debug.devoptions.api.DeveloperOptionsPlugin.OnPinnedDevOptionInteraction) r12)
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.PinnedDeveloperOptionsUtil.getPinnedDevOptions(com.instagram.service.session.UserSession, X.1dm, com.instagram.debug.devoptions.api.DeveloperOptionsPlugin$OnPinnedDevOptionInteraction):java.util.List");
    }

    private final void enableRemovingPinnedOption(String str, AnonymousClass4MA r3, C23411dm r4, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        r3.A04 = new PinnedDeveloperOptionsUtil$getRemovePinLongPress$1(r4, str, onPinnedDevOptionInteraction);
    }

    private final View.OnLongClickListener getRemovePinLongPress(String str, C23411dm r3, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        return new PinnedDeveloperOptionsUtil$getRemovePinLongPress$1(r3, str, onPinnedDevOptionInteraction);
    }

    private final void enableRemovingPinnedOption(String str, AnonymousClass4MC r3, C23411dm r4, DeveloperOptionsPlugin.OnPinnedDevOptionInteraction onPinnedDevOptionInteraction) {
        r3.A07 = new PinnedDeveloperOptionsUtil$getRemovePinLongPress$1(r4, str, onPinnedDevOptionInteraction);
    }
}
