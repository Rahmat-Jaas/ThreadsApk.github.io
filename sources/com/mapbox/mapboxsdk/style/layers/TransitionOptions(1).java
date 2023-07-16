package com.mapbox.mapboxsdk.style.layers;

import X.C18190wL;

public class TransitionOptions {
    public long delay;
    public long duration;
    public boolean enablePlacementTransitions;

    public static TransitionOptions fromTransitionOptions(long j, long j2) {
        return new TransitionOptions(j, j2, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TransitionOptions transitionOptions = (TransitionOptions) obj;
            return this.duration == transitionOptions.duration && this.delay == transitionOptions.delay && this.enablePlacementTransitions == transitionOptions.enablePlacementTransitions;
        }
        return false;
    }

    public int hashCode() {
        long j = this.duration;
        long j2 = this.delay;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.enablePlacementTransitions ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("TransitionOptions{duration=");
        A0s.append(this.duration);
        A0s.append(", delay=");
        A0s.append(this.delay);
        A0s.append(", enablePlacementTransitions=");
        A0s.append(this.enablePlacementTransitions);
        return C18190wL.A0o(A0s);
    }

    public TransitionOptions(long j, long j2, boolean z) {
        this.duration = j;
        this.delay = j2;
        this.enablePlacementTransitions = z;
    }

    public static TransitionOptions fromTransitionOptions(long j, long j2, boolean z) {
        return new TransitionOptions(j, j2, z);
    }
}
