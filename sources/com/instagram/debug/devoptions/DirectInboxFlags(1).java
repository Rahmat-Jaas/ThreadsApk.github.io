package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import com.instagram.debug.devoptions.DirectInboxDevUtil;
import java.util.List;
import java.util.NoSuchElementException;

public final class DirectInboxFlags {
    public final List booleanParams;
    public final List stringParams;

    public final DirectInboxDevUtil.ExperimentFlag getBooleanFlag(String str) {
        C04220Ms.A0B(str, 0);
        for (DirectInboxDevUtil.ExperimentFlag experimentFlag : this.booleanParams) {
            if (C04220Ms.A0I(experimentFlag.name, str)) {
                return experimentFlag;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final DirectInboxDevUtil.ExperimentFlag getStringFlag(String str) {
        C04220Ms.A0B(str, 0);
        for (DirectInboxDevUtil.ExperimentFlag experimentFlag : this.stringParams) {
            if (C04220Ms.A0I(experimentFlag.name, str)) {
                return experimentFlag;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final List getBooleanParams() {
        return this.booleanParams;
    }

    public final List getStringParams() {
        return this.stringParams;
    }

    public DirectInboxFlags(List list, List list2) {
        AnonymousClass0wJ.A1O(list, list2);
        this.booleanParams = list;
        this.stringParams = list2;
    }
}
