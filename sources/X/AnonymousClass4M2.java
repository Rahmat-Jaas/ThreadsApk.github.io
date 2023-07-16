package X;

import android.os.Bundle;
import com.instagram.archive.fragment.ArchiveReelFragment;

/* renamed from: X.4M2  reason: invalid class name */
public final class AnonymousClass4M2 implements C21661By7 {
    public final /* synthetic */ ArchiveReelFragment A00;

    public final void Bw8() {
    }

    public AnonymousClass4M2(ArchiveReelFragment archiveReelFragment) {
        this.A00 = archiveReelFragment;
    }

    public final void Bw9() {
        ArchiveReelFragment archiveReelFragment = this.A00;
        C25786Drz A0Q = C18180wK.A0Q(archiveReelFragment.requireActivity(), archiveReelFragment.A08);
        C19554AyF.A02();
        AnonymousClass228 r3 = AnonymousClass228.AUTO_SAVE_SETTINGS_ONLY;
        AnonymousClass1wT r2 = new AnonymousClass1wT();
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_MODE", r3);
        C18180wK.A0x(A06, r2, A0Q);
    }
}
