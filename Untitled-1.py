def applyDiscount(itemPrice, percentDiscounted):
    discount = 100 - percentDiscounted
    multiplyer = discount/100
    itemPrice = itemPrice * multiplyer
    return(itemPrice)

def applyTax(cost, percentTaxed):
    tax = 100 + percentTaxed
    multiplyer = tax/100
    cost = cost * multiplyer
    return(cost)
Total = applyTax(applyDiscount(
                    itemPrice=int(input("Price of Item: ")),
                    percentDiscounted= int(input("Discount Percent: ")
                )
            ),
            percentTaxed= float(input("Tax: "))
        )
print("Your Total is: $"+Total)

