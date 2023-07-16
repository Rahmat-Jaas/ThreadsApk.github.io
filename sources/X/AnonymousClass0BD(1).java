package X;

import android.os.Bundle;
import com.facebook.common.gcmcompat.OneoffTask;

/* renamed from: X.0BD  reason: invalid class name */
public final class AnonymousClass0BD {
    public final int A00;
    public final OneoffTask A01;

    public final Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt("job_id", this.A00);
        bundle.putParcelable("task", this.A01);
        return bundle;
    }

    public AnonymousClass0BD(Bundle bundle) {
        int i = bundle.getInt("job_id", -1);
        if (i != -1) {
            this.A00 = i;
            OneoffTask oneoffTask = (OneoffTask) bundle.getParcelable("task");
            if (oneoffTask != null) {
                this.A01 = oneoffTask;
                return;
            }
            throw new AnonymousClass0BI("Missing task");
        }
        StringBuilder sb = new StringBuilder("Invalid job_id: ");
        sb.append(bundle.get("job_id"));
        throw new AnonymousClass0BI(sb.toString());
    }

    public AnonymousClass0BD(OneoffTask oneoffTask, int i) {
        this.A00 = i;
        this.A01 = oneoffTask;
    }
}
