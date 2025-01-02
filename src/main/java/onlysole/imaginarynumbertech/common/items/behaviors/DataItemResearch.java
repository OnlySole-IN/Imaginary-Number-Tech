package onlysole.imaginarynumbertech.common.items.behaviors;

import gregtech.api.items.metaitem.stats.IDataItem;
import gregtech.api.items.metaitem.stats.IItemBehaviour;

public class DataItemResearch implements IItemBehaviour, IDataItem {

    private final boolean requireDataBank;

    public DataItemResearch() {
        this.requireDataBank = true;
    }

    public DataItemResearch(boolean requireDataBank) {
        this.requireDataBank = requireDataBank;
    }

    @Override
    public boolean requireDataBank() {
        return requireDataBank;
    }

//    @Override
//    public void addInformation(@NotNull ItemStack itemStack, List<String> lines) {//TODO
//        String researchId = ResearchId.readResearchId(itemStack);
//        if (researchId == null) return;
//        Collection<Recipe> recipes = ((IScannerRecipeMap) INTRecipeMaps.RESEARCH_RECIPES).getDataStickEntry(researchId);
//        if (recipes != null && !recipes.isEmpty()) {
//            lines.add(I18n.format("research.data_item.researchline.title"));
//            Collection<ItemStack> added = new ObjectOpenHashSet<>();
//            for (Recipe recipe : recipes) {
//                ItemStack output = recipe.getOutputs().get(0);
//                if (added.add(output)) {
//                    lines.add(I18n.format("research.data_item.researchline.data", output.getDisplayName()));
//                }
//            }
//        }
//    }
}
