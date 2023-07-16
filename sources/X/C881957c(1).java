package X;

import java.lang.ref.WeakReference;
import java.util.UUID;

/* renamed from: X.57c  reason: invalid class name and case insensitive filesystem */
public final class C881957c extends C62793ak {
    public WeakReference A00;
    public final UUID A01;

    public C881957c(C121177En r3) {
        C04220Ms.A0B(r3, 1);
        UUID uuid = (UUID) r3.A00("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            r3.A02("SaveableStateHolder_BackStackEntryKey", uuid);
            C04220Ms.A06(uuid);
        }
        this.A01 = uuid;
    }

    public final void onCleared() {
        WeakReference weakReference = this.A00;
        if (weakReference != null) {
            C145108jq r1 = (C145108jq) weakReference.get();
            if (r1 != null) {
                r1.CcR(this.A01);
            }
            WeakReference weakReference2 = this.A00;
            if (weakReference2 != null) {
                weakReference2.clear();
                return;
            }
        }
        C04220Ms.A0E("saveableStateHolderRef");
        throw null;
    }
}
