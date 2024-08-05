import cv2
import numpy as np
import matplotlib.pyplot as plt

# Load the image
image_path = 'F:/NCET/2023-24/2023-24 EVEN/Computer Vision with Machine Learning/Lab/LabPrograms/car-1.jpeg'  # Replace with your image path
image = cv2.imread(image_path, cv2.IMREAD_GRAYSCALE)  # Read as grayscale

# Create a kernel (structuring element)
kernel_size = (5, 5)  # Example kernel size
kernel = np.ones(kernel_size, np.uint8)

# Apply dilation
dilated_image = cv2.dilate(image, kernel, iterations=1)

# Apply erosion
eroded_image = cv2.erode(image, kernel, iterations=1)

# Display the original, dilated, and eroded images
plt.figure(figsize=(15, 5))

plt.subplot(1, 3, 1)
plt.title('Original Image')
plt.imshow(image, cmap='gray')
plt.axis('off')

plt.subplot(1, 3, 2)
plt.title('Dilated Image')
plt.imshow(dilated_image, cmap='gray')
plt.axis('off')

plt.subplot(1, 3, 3)
plt.title('Eroded Image')
plt.imshow(eroded_image, cmap='gray')
plt.axis('off')

plt.show()

# Save the processed images
dilated_image_path = 'F:/NCET/2023-24/2023-24 EVEN/Computer Vision with Machine Learning/Lab/LabPrograms/dilated_image.jpg'  # Replace with your desired save path
eroded_image_path = 'F:/NCET/2023-24/2023-24 EVEN/Computer Vision with Machine Learning/Lab/LabPrograms/eroded_image.jpg'  # Replace with your desired save path
cv2.imwrite(dilated_image_path, dilated_image)
cv2.imwrite(eroded_image_path, eroded_image)

