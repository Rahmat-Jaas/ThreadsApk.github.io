package com.instagram.universalcreationsheet;

public final class UniversalCreationMenuFragmentLifecycleUtil {
    public static void cleanupReferences(UniversalCreationMenuFragment universalCreationMenuFragment) {
        universalCreationMenuFragment.mRecyclerAdapter = null;
        universalCreationMenuFragment.mRecyclerView = null;
    }
}
