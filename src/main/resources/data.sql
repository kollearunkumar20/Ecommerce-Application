INSERT INTO users (username, password, issubscribed)
VALUES ('arun', '$2a$12$rFQagOttk0BGLKmjrjOHTOVLTwpt2RtrIjjNjg8TjvxHTnx8wODqG', true), 
       ('chandu', '$2a$12$bjvUocQ2ge/ATpx6eZMxz.32Pf5.jtcZP9cf0LonjnHRTU/wWysP6', false);

INSERT INTO category (categoryId, categoryName) VALUES
(1, 'Clothing'),
(2, 'Electronics'),
(3, 'Appliances'),
(4, 'Grocery'),
(5, 'Toys');
INSERT INTO product (id, name, brand, price, imageurl, rating, description, category_id) VALUES
(1, 'Wide Bowknot Hat', 'MAJIK', 288, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-cap.png', 3.6, 
 'This Summes perfect White Wide Brim Straw Beach hat is great for sunny days. Made of lightweight, skin-friendly paper straw for comfort and style.', 1),

(2, 'Plain Round Neck T-shirt', 'Huetrap', 395, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-fit-t-shirt.png', 4.1, 
 'A classic round neck T-shirt with a soft cotton blend. Designed for everyday comfort and a perfect fit.', 1),

(3, 'Cotton Hoodie', 'Scott International', 498, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-hoodie.png', 3.8, 
 'Stay warm and stylish with this premium cotton hoodie. Soft, breathable, and perfect for layering in all seasons.', 1),

(4, 'Mens Waistcoat', 'LEVIS', 2500, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-jacket.png', 4.3, 
 'A sophisticated waistcoat for men, perfect for formal and semi-formal occasions. Crafted with premium fabric for a sleek and polished look.', 1),

(5, 'Slim Fit Jeans', 'LEVIS', 1469, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-jeans-pants.png', 3.1, 
 'Trendy slim-fit jeans designed for modern comfort and style. Stretchable fabric for a perfect fit and long-lasting durability.', 1),

(6, 'Miss Chase Bodycon Dress', 'LEVIS', 974, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-modren-net.png', 3.8, 
 'A stunning bodycon dress with a sleek silhouette. Perfect for parties and special occasions, offering a chic and elegant look.', 1),

(7, 'Zari Design Kurta', 'Libas', 1869, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-punjabi.png', 4.4, 
 'A beautifully designed Zari embroidered kurta that blends tradition with modern elegance. Perfect for festive and cultural events.', 1),

(8, 'Slim Fit Blazer', 'LEVIS', 2599, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-purple-jacket.png', 4.2, 
 'A stylish slim-fit blazer that adds a touch of sophistication to your wardrobe. Ideal for both formal and casual occasions.', 1),

(9, 'Animal Printed Shirt', 'Mufti', 1017, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-short-sleeves-shirt.png', 4.0, 
 'Make a bold fashion statement with this trendy animal-printed shirt. Lightweight and breathable for all-day comfort.', 1),

(10, 'Polyester Saree', 'Ahalyaa', 419, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-side-sareee.png', 3.8, 
 'A stunning polyester saree with elegant drape and intricate design. Perfect for traditional occasions and celebrations.', 1),

(11, 'Warm Up Jacket', 'Monte Carlo', 2796, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-sim-jacket.png', 4.4, 
 'A comfortable and stylish warm-up jacket designed to keep you cozy in cold weather. Perfect for outdoor activities and casual wear.', 1),

(12, 'Wrap Dress', 'Vero Moda', 3039, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-simple-formal.png', 3.2, 
 'A chic and elegant wrap dress, ideal for both formal and casual occasions. Made from high-quality fabric for a comfortable fit.', 1),

(13, 'Knit Cream Sweater', 'MansiCollections', 996, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-stylish-sweater.png', 3.2, 
 'Stay warm and fashionable with this soft knit cream sweater. A perfect winter essential for everyday wear.', 1),

(14, 'Sheer Anarkali', 'Saadgi', 2172, 'https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-white-punjabi.png', 3.2, 
 'An elegant sheer Anarkali dress with intricate embroidery. Perfect for festive and wedding occasions.', 1),

(15, 'Embellished Maxi Dress', 'STREET 9', 1799, 'https://assets.ccbp.in/frontend/react-js/ecommerce/cloths-blue-fork.png', 3.2, 
 'A beautifully designed maxi dress with subtle embellishments. Ideal for evening parties and special events.', 1),

(16, 'Embroidered Net Gown', 'Manyavar', 62990, 'https://assets.ccbp.in/frontend/react-js/ecommerce/cloths-long-fork.png', 3.2, 
 'A luxurious embroidered net gown with stunning craftsmanship. A timeless piece for grand celebrations.', 1),

(17, 'Analog Mens Watch', 'Fastrack', 1850, 'https://assets.ccbp.in/frontend/react-js/ecommerce/electronics-casual-watch.png', 4.2, 
 'A stylish and durable analog watch with a sleek design. A perfect accessory for any occasion.', 2),

(18, 'Tea Kettle Pot', 'Indian Art Villa', 1685, 'https://assets.ccbp.in/frontend/react-js/ecommerce/electronics-copper-kettle.png', 3.8, 
 'A traditional copper tea kettle pot that enhances the flavor of your tea. Perfect for home and gifting.', 2),

(19, 'Handheld Full Body Massager', 'AGARO REGAL', 1299, 'https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-body-massager.png', 4.3, 
 'A powerful handheld massager designed to relieve muscle tension and improve blood circulation.', 3),

(20, 'True Wireless Earbuds', 'LG', 13499, 'https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-ear-buds.png', 4.4, 
 'High-quality true wireless earbuds with deep bass and crystal-clear sound. Perfect for music lovers and calls.', 3),

(21, 'Mixer Grinder', 'Lifelong', 1699, 'https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-mixer-grinder.png', 3.9, 
 'A powerful and efficient mixer grinder for all your kitchen needs. Durable and easy to use.', 3),

(22, 'SilverBullet Mixer Grinder', 'COOKWELL', 1899, 'https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-mixer-grinder-white.png', 4.1, 
 'A compact and stylish mixer grinder with multiple attachments for versatile cooking.', 3),

(23, 'PS5 Controller Charger', 'New World', 1749, 'https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-ps5-controller.png', 3.3, 
 'Fast and efficient charging dock for PS5 controllers. Keeps your controllers ready for action.', 3),

(24, 'Podcast Microphone', 'MAONO', 5555, 'https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-singing-mike.png', 4.4, 
 'A high-quality podcast microphone with noise reduction. Ideal for content creators and professional recording.', 3),

(25, 'Dynamic Microphone', 'JTS Store', 1699, 'https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-solo-mike.png', 3.9, 
 'A premium dynamic microphone with excellent sound clarity. Suitable for singing, podcasts, and speeches.', 3),

(26, 'Front Load Machine', 'Samsung', 22490, 'https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-washing-machine.png', 4.5, 
 'An advanced front-load washing machine with energy-saving features and powerful cleaning technology. Designed for efficient and convenient laundry.', 3),

(27, 'Eggs', 'Naturoz', 60, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-eggs.png', 3.6, 
 'Fresh and nutritious eggs sourced from healthy farms. Perfect for your daily protein needs.', 4),

(28, 'Chilli Extract Sauce', 'Everin', 788, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-extract.png', 4.1, 
 'A fiery and flavorful chilli extract sauce, ideal for adding a spicy kick to your favorite dishes.', 4),

(29, 'Flour Unbleached', 'TWF Store', 200, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery--flour.png', 4.3, 
 'Premium unbleached flour for baking and cooking. Made from high-quality wheat for a natural taste.', 4),

(30, 'Fresh Produce Green Chilli', 'Amazon', 30, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-green-chilli.png', 4.2, 
 'Spicy and fresh green chilies, perfect for enhancing the taste of your dishes.', 4),

(31, 'Maroon Kumkum', 'Amazon', 200, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery--kumkum.png', 3.9, 
 'High-quality maroon kumkum powder for religious rituals and traditional ceremonies.', 4),

(32, 'Fresh Lemon, 100g', 'Amazon', 50, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-lemons.png', 4.5, 
 'Fresh and juicy lemons, rich in vitamin C, ideal for cooking and refreshing drinks.', 4),

(33, 'Virgin Avocado Oil', 'ProV', 4144, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-oil.png', 4.4, 
 'Premium cold-pressed virgin avocado oil, perfect for cooking and skincare benefits.', 4),

(34, 'Basmati Rice', 'Fortune', 244, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-rice.png', 3.6, 
 'Long-grain basmati rice with a rich aroma and fluffy texture, ideal for biryanis and pulao.', 4),

(35, 'Crystal Sugar', 'NatureVit', 278, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-sugar-cubes.png', 3.6, 
 'Pure and refined crystal sugar, perfect for sweetening your beverages and desserts.', 4),

(36, 'Turmeric Powder', 'Patanjali', 1234, 'https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-turmeric.png', 2.8, 
 'Organic turmeric powder with high curcumin content, known for its medicinal and culinary benefits.', 4),

(37, 'Batman Batmobile', 'Funskool', 745, 'https://assets.ccbp.in/frontend/react-js/ecommerce/toys-batman-toy.png', 4.7, 
 'A sleek and detailed Batmobile toy, perfect for young Batman fans and collectors.', 5),

(38, 'Captain America Shield', 'Funskool', 1450, 'https://assets.ccbp.in/frontend/react-js/ecommerce/toys-captain-america-shield.png', 4.5, 
 'A sturdy and realistic Captain America shield, great for role-playing and display.', 5),

(39, 'Iron Man Shield', 'Funskool', 850, 'https://assets.ccbp.in/frontend/react-js/ecommerce/toys-iron-man-shield.png', 4.1, 
 'An exciting Iron Man shield toy with a cool design, perfect for superhero enthusiasts.', 5),

(40, 'Spider-Man Car', 'Funskool', 1100, 'https://assets.ccbp.in/frontend/react-js/ecommerce/toys-spiderman-car.png', 3.9, 
 'A fun and vibrant Spider-Man-themed toy car, ideal for kids who love action-packed play.', 5),

(41, 'Transformers Bot', 'Hasbro', 2900, 'https://assets.ccbp.in/frontend/react-js/ecommerce/toys-transformer-bot.png', 4.4, 
 'A high-quality Transformers bot that can switch between robot and vehicle mode for endless fun.', 5);
