# food-deliver-application
The Food Delivery Application is a full-stack web application designed to simplify food ordering and delivery. Customers can browse restaurants, select their favorite dishes, place orders, and track deliveries in real-time. The system also provides an admin panel for restaurant owners to manage menus, orders, and customer feedback.


# 🍔 Food Delivery Application

A full-stack food delivery application built using **Spring Boot**, **React**, and **MongoDB** to provide a seamless experience for customers to order food online.

## 📌 Features  
✅ User authentication (Signup/Login)  
✅ Browse restaurants and food items  
✅ Add items to the cart and place orders  
✅ Real-time order tracking  
✅ Payment integration  
✅ Admin dashboard for managing restaurants, menu, and orders  

## 🛠️ Tech Stack  
- **Backend**: Spring Boot, Java, Spring Security, JWT Authentication  
- **Frontend**: React, Tailwind CSS  
- **Database**: MongoDB  
- **Real-time Features**: WebSockets (for live order tracking)  

## 📂 Project Structure  

/backend ├── src/main/java/com/fooddelivery │ ├── controllers/ # API Controllers │ ├── services/ # Business Logic │ ├── repositories/ # MongoDB Repositories │ ├── models/ # Entity Models │ ├── security/ # JWT Authentication │ ├── config/ # Spring Configurations │ └── application.yml # App Configuration

/frontend ├── src/ │ ├── components/ # UI Components │ ├── pages/ # React Pages │ ├── services/ # API Calls │ ├── context/ # Global State Management │ ├── App.js # Main App │ ├── index.js # Entry Point │ └── tailwind.config.js # Tailwind CSS Configuration

bash
Copy
Edit

## 🚀 Installation & Setup  

### 1️⃣ Clone the Repository  
```sh
git clone https://github.com/your-username/food-delivery-app.git
cd food-delivery-app
2️⃣ Backend Setup (Spring Boot)
sh
Copy
Edit
cd backend
mvn clean install
mvn spring-boot:run
Make sure MongoDB is running locally or update application.yml with your cloud DB.
3️⃣ Frontend Setup (React.js)
sh
Copy
Edit
cd frontend
npm install
npm start
