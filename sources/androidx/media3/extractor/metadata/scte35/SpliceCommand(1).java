package androidx.media3.extractor.metadata.scte35;

import X.AnonymousClass00U;
import X.C18210wN;
import androidx.media3.common.Metadata;

public abstract class SpliceCommand implements Metadata.Entry {
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return AnonymousClass00U.A0L("SCTE-35 splice command: type=", C18210wN.A0e(this));
    }
}
