package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import com.instagram.debug.devoptions.PanavisionDevUtil;
import java.util.List;
import java.util.NoSuchElementException;

public final class PanavisionFlags {
    public final List allBoolParams;
    public final List allDoubleParams;
    public final List allStringParams;

    public final PanavisionDevUtil.ExperimentFlag getBFlag(String str) {
        C04220Ms.A0B(str, 0);
        for (PanavisionDevUtil.ExperimentFlag experimentFlag : this.allBoolParams) {
            if (C04220Ms.A0I(experimentFlag.name, str)) {
                return experimentFlag;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PanavisionDevUtil.ExperimentFlag getDFlag(String str) {
        C04220Ms.A0B(str, 0);
        for (PanavisionDevUtil.ExperimentFlag experimentFlag : this.allDoubleParams) {
            if (C04220Ms.A0I(experimentFlag.name, str)) {
                return experimentFlag;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PanavisionDevUtil.ExperimentFlag getSFlag(String str) {
        C04220Ms.A0B(str, 0);
        for (PanavisionDevUtil.ExperimentFlag experimentFlag : this.allStringParams) {
            if (C04220Ms.A0I(experimentFlag.name, str)) {
                return experimentFlag;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final List getAllBoolParams() {
        return this.allBoolParams;
    }

    public final List getAllDoubleParams() {
        return this.allDoubleParams;
    }

    public final List getAllStringParams() {
        return this.allStringParams;
    }

    public PanavisionFlags(List list, List list2, List list3) {
        AnonymousClass0wJ.A1O(list, list2);
        C04220Ms.A0B(list3, 3);
        this.allBoolParams = list;
        this.allStringParams = list2;
        this.allDoubleParams = list3;
    }
}
