package com.example.shoppinglist2.domain

class EditShopItemUseCase(private var shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem){
        shopListRepository.editShopItem(shopItem)
    }
}