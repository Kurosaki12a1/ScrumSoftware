package com.bku.scrumsoftware;

import java.io.Serializable;

public class ProductBacklogItem implements Serializable {
    private String itemId, itemName, itemPriority;
    public ProductBacklogItem (String id, String name, String priority) {
        this.itemId = id;
        this.itemName = name;
        this.itemPriority = priority;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPriority() {
        return itemPriority;
    }

    public void setItemPriority(String itemPriority) {
        this.itemPriority = itemPriority;
    }
    @Override
    public String toString() {
        return this.itemId + " - " + this.itemName + " - " + this.itemPriority;
    }
}
