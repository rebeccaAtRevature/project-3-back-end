package com.project3.revtech.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishListItemPojo {
	private int wishItemId;
	private int wishListId;
	private int productId;

}
