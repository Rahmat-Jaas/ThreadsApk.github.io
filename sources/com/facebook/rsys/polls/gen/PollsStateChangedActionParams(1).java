package com.facebook.rsys.polls.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18240wQ;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

public class PollsStateChangedActionParams {
    public final PollsFeaturePermissionsModel permissions;
    public final Map polls;
    public final HashSet processedActionIds;

    public static native PollsStateChangedActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsStateChangedActionParams)) {
            return false;
        }
        PollsStateChangedActionParams pollsStateChangedActionParams = (PollsStateChangedActionParams) obj;
        return this.polls.equals(pollsStateChangedActionParams.polls) && this.permissions.equals(pollsStateChangedActionParams.permissions) && this.processedActionIds.equals(pollsStateChangedActionParams.processedActionIds);
    }

    public final int hashCode() {
        return C18220wO.A06(this.processedActionIds, AnonymousClass0wJ.A05(this.permissions, C18210wN.A00(this.polls.hashCode())));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PollsStateChangedActionParams{polls=");
        A0s.append(this.polls);
        A0s.append(",permissions=");
        A0s.append(this.permissions);
        A0s.append(",processedActionIds=");
        A0s.append(this.processedActionIds);
        return C18180wK.A0i("}", A0s);
    }

    public PollsStateChangedActionParams(Map map, PollsFeaturePermissionsModel pollsFeaturePermissionsModel, HashSet hashSet) {
        C18240wQ.A1L(map, pollsFeaturePermissionsModel, hashSet);
        this.polls = map;
        this.permissions = pollsFeaturePermissionsModel;
        this.processedActionIds = hashSet;
    }
}
